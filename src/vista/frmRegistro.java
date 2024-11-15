package vista;

import controlador.ctrlRegistro;
import modelo.Usuario;

/**
 *
 * @author Paola
 */
public class frmRegistro extends javax.swing.JFrame {

    
    public frmRegistro() {
        initComponents();
         this.setLocationRelativeTo(this);
    }
    
    public static void initFrmRegistro(){
        Usuario modelo = new Usuario();
        frmRegistro vista = new frmRegistro();
        ctrlRegistro controlador = new ctrlRegistro(modelo, vista);
        
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
        txtEdadUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        txtContraUsuario = new javax.swing.JTextField();
        btnRegistrar = new com.k33ptoo.components.KButton();
        btnIrLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 213, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEdadUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtEdadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 230, 60));

        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 60));

        txtApellidoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 220, 60));

        txtCorreoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo Eléctronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 220, 60));

        txtContraUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtContraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 230, 60));

        btnRegistrar.setText("Registrarse");
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setkBackGroundColor(new java.awt.Color(255, 204, 204));
        btnRegistrar.setkEndColor(new java.awt.Color(195, 139, 228));
        btnRegistrar.setkHoverEndColor(new java.awt.Color(195, 139, 228));
        btnRegistrar.setkStartColor(new java.awt.Color(255, 153, 153));
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 140, -1));

        btnIrLogin.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnIrLogin.setForeground(new java.awt.Color(255, 102, 51));
        btnIrLogin.setText("¿Ya tiene una cuenta registrada?");
        btnIrLogin.setContentAreaFilled(false);
        btnIrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangle 14.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellas.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 510, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsuarioActionPerformed

    private void txtContraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraUsuarioActionPerformed

    private void txtEdadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadUsuarioActionPerformed

    private void btnIrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIrLoginActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmRegistro();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIrLogin;
    public com.k33ptoo.components.KButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellidoUsuario;
    public javax.swing.JTextField txtContraUsuario;
    public javax.swing.JTextField txtCorreoUsuario;
    public javax.swing.JTextField txtEdadUsuario;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

    
}
