/*
 * Actividad 02 - Implementacion de un TDA en Java
 * Autor: Nathan Hazael Merenciano Hernandez
 */
package com.banco;

import com.banco.vista.VentanaCuenta;

public class Main {

    public static void main(String[] args) {
        // tema Nimbus para que se vea mejor
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("No se pudo cargar el tema: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> new VentanaCuenta().setVisible(true));
    }
}
