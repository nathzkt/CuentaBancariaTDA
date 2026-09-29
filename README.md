# Cuenta Bancaria TDA

Actividad 02 - Implementación de un TDA en Java

**Autor:** Nathan Hazael Merenciano Hernandez

Aplicación de escritorio hecha en Java Swing (NetBeans) que maneja una cuenta de ahorro:
depósitos, retiros, interés mensual, proyección del saldo y resumen de movimientos.

## Clases

- `CuentaBancaria` - TDA principal (titular, número de cuenta, saldo y arreglo de movimientos)
- `CuentaAhorro` - hereda de `CuentaBancaria`, agrega tasa de interés y un saldo mínimo de $100
- `VentanaCuenta` - interfaz gráfica
- `Main` - inicia el programa

Métodos recursivos: `sumarDepositos()` y `sumarRetiros()` en `CuentaBancaria`, y `proyectarSaldo()` en `CuentaAhorro`.

## Cómo ejecutarlo

Abrir la carpeta del proyecto en NetBeans (File > Open Project) y darle Run.
Requiere JDK 17 o superior, no usa librerías externas.
