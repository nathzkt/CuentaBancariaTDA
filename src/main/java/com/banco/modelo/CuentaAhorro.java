/*
 * Actividad 02 - Implementacion de un TDA en Java
 * Autor: Nathan Hazael Merenciano Hernandez
 *
 * Cuenta de ahorro, hereda de CuentaBancaria.
 * Genera interes y no deja retirar todo el dinero.
 */
package com.banco.modelo;

public class CuentaAhorro extends CuentaBancaria {

    private final double SALDO_MINIMO = 100;
    private double tasaInteres;   // porcentaje anual

    public CuentaAhorro(String titular, String numeroCuenta, double tasaInteres) {
        super(titular, numeroCuenta);
        if (tasaInteres <= 0 || tasaInteres > 30) {
            throw new IllegalArgumentException("La tasa debe estar entre 0 y 30%");
        }
        this.tasaInteres = tasaInteres;
    }

    public double obtenerTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        if (tasaInteres <= 0 || tasaInteres > 30) {
            throw new IllegalArgumentException("La tasa debe estar entre 0 y 30%");
        }
        this.tasaInteres = tasaInteres;
    }

    // en ahorro siempre tiene que quedar el saldo minimo
    @Override
    public void retirar(double monto) {
        if (monto > 0 && consultarSaldo() - monto < SALDO_MINIMO) {
            throw new IllegalStateException("En una cuenta de ahorro deben quedar al menos $" + String.format("%.2f", SALDO_MINIMO));
        }
        super.retirar(monto);
    }

    // aplica el interes de un mes y regresa cuanto se gano
    public double aplicarInteresMensual() {
        double interes = consultarSaldo() * (tasaInteres / 12) / 100;
        if (interes > 0) {
            depositar(interes);
        }
        return interes;
    }

    // recursivo: saldo que habria despues de cierta cantidad de meses
    public double proyectarSaldo(double monto, int meses) {
        if (meses <= 0) {   // caso base: ya no quedan meses
            return monto;
        }
        double conInteres = monto + monto * (tasaInteres / 12) / 100;
        return proyectarSaldo(conInteres, meses - 1);   // caso recursivo
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nTasa anual: " + tasaInteres + "%";
    }
}
