/*
 * Actividad 02 - Implementacion de un TDA en Java
 * Autor: Nathan Hazael Merenciano Hernandez
 *
 * TDA Cuenta Bancaria
 */
package com.banco.modelo;

public class CuentaBancaria {

    // ---- implementación oculta ----
    private double saldo;
    private String titular;
    private String numeroCuenta;
    private double[] movimientos;   // depositos (+) y retiros (-)
    private int totalMovimientos;

    // ---- constructor: única forma de crear el dato ----
    public CuentaBancaria(String titular, String numeroCuenta) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        if (numeroCuenta == null || numeroCuenta.length() != 10) {
            throw new IllegalArgumentException("El número de cuenta debe tener 10 dígitos");
        }
        for (int i = 0; i < numeroCuenta.length(); i++) {
            if (!Character.isDigit(numeroCuenta.charAt(i))) {
                throw new IllegalArgumentException("El número de cuenta solo puede tener números");
            }
        }
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.movimientos = new double[100];
        this.totalMovimientos = 0;
    }

    // ---- especificación: operaciones públicas del TDA ----
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        registrarMovimiento(monto);
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalStateException("Fondos insuficientes");
        }
        registrarMovimiento(-monto);
        saldo -= monto;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String obtenerTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        this.titular = titular;
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public int obtenerTotalMovimientos() {
        return totalMovimientos;
    }

    public double obtenerMovimiento(int indice) {
        if (indice < 0 || indice >= totalMovimientos) {
            throw new IllegalArgumentException("No existe ese movimiento");
        }
        return movimientos[indice];
    }

    // recursivo: suma todos los depositos del arreglo
    public double sumarDepositos(int indice) {
        if (indice == totalMovimientos) {   // caso base: ya no quedan movimientos
            return 0;
        }
        double valor = 0;
        if (movimientos[indice] > 0) {
            valor = movimientos[indice];
        }
        return valor + sumarDepositos(indice + 1);   // caso recursivo
    }

    // recursivo: suma todos los retiros del arreglo
    public double sumarRetiros(int indice) {
        if (indice == totalMovimientos) {   // caso base
            return 0;
        }
        double valor = 0;
        if (movimientos[indice] < 0) {
            valor = -movimientos[indice];
        }
        return valor + sumarRetiros(indice + 1);   // caso recursivo
    }

    public String mostrarDatos() {
        return "Titular: " + titular
                + "\nCuenta: " + numeroCuenta
                + "\nSaldo: $" + String.format("%.2f", saldo);
    }

    // guarda un movimiento en el arreglo
    private void registrarMovimiento(double monto) {
        if (totalMovimientos == movimientos.length) {
            throw new IllegalStateException("Ya no se pueden registrar más movimientos");
        }
        movimientos[totalMovimientos] = monto;
        totalMovimientos++;
    }
}
