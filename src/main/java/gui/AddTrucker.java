package gui;

import crud.CrudTruckers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import classes.Trucker;

/*
------------------------------------------------------------
> PACKAGES

- AUTHOR:     Doramas García Jorge
- EMAIL:      dev.doramas@gmail.com
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/packages
------------------------------------------------------------
*/

public class AddTrucker extends javax.swing.JDialog {
    
    App app;

    /**
     * Creates new form AnadirEditarCamion
     */
    public AddTrucker(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        app = (App) parent;
        setTitle("Añadir camionero");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoRFC = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoPoblacion = new javax.swing.JTextField();
        campoSalario = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("RFC:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 5, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        campoRFC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoRFC.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 5, 25);
        getContentPane().add(campoRFC, gridBagConstraints);

        campoNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoNombre.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(campoNombre, gridBagConstraints);

        jLabel5.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel5, gridBagConstraints);

        jButton1.setText("Añadir camionero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 25, 25);
        getContentPane().add(jButton1, gridBagConstraints);

        jLabel6.setText("Salario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("Población:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel7, gridBagConstraints);

        campoPoblacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoPoblacion.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(campoPoblacion, gridBagConstraints);

        campoSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoSalario.setText("2000");
        campoSalario.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(campoSalario, gridBagConstraints);

        campoTelefono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoTelefono.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(campoTelefono, gridBagConstraints);

        campoDireccion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDireccion.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(campoDireccion, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 35);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            if (campoRFC.getText().isBlank() || campoNombre.getText().isBlank() || campoTelefono.getText().isBlank()
                    || campoDireccion.getText().isBlank() || campoSalario.getText().isBlank() || campoPoblacion.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos correctamente.");
            } else if (!campoRFC.getText().toUpperCase().matches("[A-Z]{4}\\d{6}[A-Z]{3}")) {
                JOptionPane.showMessageDialog(null, "Inserte un RFC correcto (Formato AAAA000000AAA.");
            } else if (!campoTelefono.getText().toUpperCase().matches("[6789]\\d{8}")) {
                JOptionPane.showMessageDialog(null, "Inserte un teléfono correcto (9 dígitos).");
            } else if (!campoSalario.getText().matches("[1-9]\\d{2,5}(\\.\\d{1,2})?")) {
                JOptionPane.showMessageDialog(null, "Inserte un salario correcto.");
            } else if (CrudTruckers.comprobarExistencia(campoRFC.getText())) {
                JOptionPane.showMessageDialog(null, "Ya existe un camionero con el RFC '" + campoRFC.getText() +"'.");
            } else {
                CrudTruckers.crear(new Trucker(campoRFC.getText(), campoNombre.getText(), Integer.parseInt(campoTelefono.getText()), campoDireccion.getText(), Float.parseFloat(campoSalario.getText()), campoPoblacion.getText()));
                JOptionPane.showMessageDialog(null, "Datos añadidos correctamente.");
                app.actualizarTablas();
                dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddTruck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTrucker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrucker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrucker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrucker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddTrucker dialog = new AddTrucker(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPoblacion;
    private javax.swing.JTextField campoRFC;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}