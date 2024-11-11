/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ctrlLogin;
import modelo.Usuario;

/**
 *
 * @author Paola
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public static void initFrmLogin(){
        Usuario modelo = new Usuario();
        frmLogin vista = new frmLogin();
        ctrlLogin controlador = new ctrlLogin(modelo, vista);
        
        vista.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new com.k33ptoo.components.KButton();
        txtCorreoLogin = new javax.swing.JTextField();
        txtContraLogin = new javax.swing.JTextField();
        btnIrRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 213, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIngresar.setkEndColor(new java.awt.Color(255, 153, 153));
        btnIngresar.setkHoverEndColor(new java.awt.Color(184, 114, 225));
        btnIngresar.setkStartColor(new java.awt.Color(102, 153, 255));
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        txtCorreoLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo Eléctronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtCorreoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 240, 60));

        txtContraLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtContraLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 60));

        btnIrRegistro.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnIrRegistro.setForeground(new java.awt.Color(26, 97, 238));
        btnIrRegistro.setText("¿Aun no tienes una cuenta?");
        btnIrRegistro.setContentAreaFilled(false);
        jPanel1.add(btnIrRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangle 14.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellas.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 280, 510, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoLoginActionPerformed

    private void txtContraLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraLoginActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 initFrmLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.k33ptoo.components.KButton btnIngresar;
    public javax.swing.JButton btnIrRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtContraLogin;
    public javax.swing.JTextField txtCorreoLogin;
    // End of variables declaration//GEN-END:variables
}
