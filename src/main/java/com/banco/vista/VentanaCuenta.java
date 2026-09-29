/*
 * Actividad 02 - Implementacion de un TDA en Java
 * Autor: Nathan Hazael Merenciano Hernandez
 *
 * Ventana principal del programa
 */
package com.banco.vista;

import com.banco.modelo.CuentaAhorro;
import javax.swing.JOptionPane;

public class VentanaCuenta extends javax.swing.JFrame {

    private CuentaAhorro cuenta;

    public VentanaCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTasa = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMeses = new javax.swing.JTextField();
        btnProyectar = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuenta de Ahorro - Nathan Merenciano");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Banco TDA - Cuenta de Ahorro");

        lblAutor.setText("Autor: Nathan Hazael Merenciano Hernandez");

        jLabel1.setText("Titular:");

        jLabel2.setText("No. de cuenta:");

        jLabel3.setText("Tasa anual (%):");

        btnAbrir.setText("Abrir cuenta");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jLabel4.setText("Cuenta:");

        lblInfo.setText("Sin cuenta abierta");

        jLabel5.setText("Saldo:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSaldo.setText("$0.00");

        jLabel6.setText("Monto ($):");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        jLabel7.setText("Meses:");

        btnProyectar.setText("Proyectar saldo");
        btnProyectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectarActionPerformed(evt);
            }
        });

        btnInteres.setText("Aplicar interés del mes");
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });

        btnResumen.setText("Ver resumen");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });

        jLabel8.setText("Movimientos:");

        txtHistorial.setEditable(false);
        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitulo)
                        .addComponent(lblAutor)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAbrir)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDepositar)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnRetirar))
                                .addComponent(btnProyectar)))
                        .addComponent(jSeparator2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblInfo)
                                .addComponent(lblSaldo)))
                        .addComponent(jSeparator3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInteres)
                            .addGap(6, 6, 6)
                            .addComponent(btnResumen))
                        .addComponent(jLabel8)
                        .addComponent(jScrollPane1))
                    .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(lblTitulo)
                    .addGap(4, 4, 4)
                    .addComponent(lblAutor)
                    .addGap(8, 8, 8)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAbrir))
                    .addGap(12, 12, 12)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblInfo))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblSaldo))
                    .addGap(8, 8, 8)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDepositar)
                        .addComponent(btnRetirar))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProyectar))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInteres)
                        .addComponent(btnResumen))
                    .addGap(12, 12, 12)
                    .addComponent(jLabel8)
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try {
            String titular = txtTitular.getText();
            String numero = txtNumCuenta.getText();
            double tasa = Double.parseDouble(txtTasa.getText());

            cuenta = new CuentaAhorro(titular, numero, tasa);
            actualizarDatos();
            JOptionPane.showMessageDialog(this, "Cuenta abierta correctamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La tasa tiene que ser un número");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        if (!hayCuenta()) {
            return;
        }
        try {
            double monto = Double.parseDouble(txtMonto.getText());
            cuenta.depositar(monto);
            actualizarDatos();
            txtMonto.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Escribe un monto válido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        if (!hayCuenta()) {
            return;
        }
        try {
            double monto = Double.parseDouble(txtMonto.getText());
            cuenta.retirar(monto);
            actualizarDatos();
            txtMonto.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Escribe un monto válido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnProyectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectarActionPerformed
        if (!hayCuenta()) {
            return;
        }
        try {
            int meses = Integer.parseInt(txtMeses.getText());
            if (meses < 1 || meses > 600) {
                JOptionPane.showMessageDialog(this, "Los meses deben estar entre 1 y 600");
                return;
            }
            double futuro = cuenta.proyectarSaldo(cuenta.consultarSaldo(), meses);
            JOptionPane.showMessageDialog(this, "En " + meses + " meses tendrías $" + String.format("%.2f", futuro));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los meses deben ser un número entero");
        }
    }//GEN-LAST:event_btnProyectarActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
        if (!hayCuenta()) {
            return;
        }
        try {
            double ganado = cuenta.aplicarInteresMensual();
            if (ganado == 0) {
                JOptionPane.showMessageDialog(this, "No hay saldo para generar interés");
            } else {
                actualizarDatos();
                JOptionPane.showMessageDialog(this, "Se ganaron $" + String.format("%.2f", ganado) + " de interés");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnInteresActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        if (!hayCuenta()) {
            return;
        }
        // los totales se calculan con los metodos recursivos, empezando en el indice 0
        double depositos = cuenta.sumarDepositos(0);
        double retiros = cuenta.sumarRetiros(0);

        String texto = cuenta.mostrarDatos()
                + "\n\nMovimientos: " + cuenta.obtenerTotalMovimientos()
                + "\nTotal depositado: $" + String.format("%.2f", depositos)
                + "\nTotal retirado: $" + String.format("%.2f", retiros);
        JOptionPane.showMessageDialog(this, texto, "Resumen", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResumenActionPerformed

    // muestra los datos de la cuenta y la lista de movimientos
    private void actualizarDatos() {
        lblInfo.setText(cuenta.obtenerTitular() + "  -  " + cuenta.obtenerNumeroCuenta()
                + "  -  " + cuenta.obtenerTasaInteres() + "% anual");
        lblSaldo.setText("$" + String.format("%.2f", cuenta.consultarSaldo()));

        txtHistorial.setText("");
        for (int i = 0; i < cuenta.obtenerTotalMovimientos(); i++) {
            double mov = cuenta.obtenerMovimiento(i);
            if (mov > 0) {
                txtHistorial.append((i + 1) + ". Depósito   $" + String.format("%.2f", mov) + "\n");
            } else {
                txtHistorial.append((i + 1) + ". Retiro     $" + String.format("%.2f", -mov) + "\n");
            }
        }
    }

    private boolean hayCuenta() {
        if (cuenta == null) {
            JOptionPane.showMessageDialog(this, "Primero abre una cuenta");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnProyectar;
    private javax.swing.JButton btnResumen;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextField txtMeses;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtTasa;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
