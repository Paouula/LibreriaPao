/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Paola
 */
public class frmCRUD extends javax.swing.JFrame {

    /**
     * Creates new form frmCRUD
     */
    public frmCRUD() {
        initComponents();
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
        txtEstadoLibro = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPublicacion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtCantidadPag = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtISBM = new javax.swing.JTextField();
        btnLimpiar = new com.k33ptoo.components.KButton();
        btnAgregar = new com.k33ptoo.components.KButton();
        btnActualizar = new com.k33ptoo.components.KButton();
        btnEliminar = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLibreria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 213, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstadoLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado del Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtEstadoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, -1));

        txtNombreLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, -1));

        txtAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, -1));

        txtPublicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Año de Publicación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, -1));

        txtEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editorial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, -1));

        txtCantidadPag.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de Páginas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtCantidadPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 200, -1));

        txtGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género Literario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, -1));

        txtISBM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ISBM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(txtISBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 200, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setkEndColor(new java.awt.Color(230, 142, 255));
        btnLimpiar.setkHoverEndColor(new java.awt.Color(224, 98, 241));
        btnLimpiar.setkHoverStartColor(new java.awt.Color(224, 98, 241));
        btnLimpiar.setkSelectedColor(new java.awt.Color(180, 62, 218));
        btnLimpiar.setkStartColor(new java.awt.Color(255, 226, 153));
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 170, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setkBackGroundColor(new java.awt.Color(255, 102, 102));
        btnAgregar.setkEndColor(new java.awt.Color(255, 153, 204));
        btnAgregar.setkHoverEndColor(new java.awt.Color(255, 102, 153));
        btnAgregar.setkHoverForeGround(new java.awt.Color(255, 102, 153));
        btnAgregar.setkHoverStartColor(new java.awt.Color(255, 102, 153));
        btnAgregar.setkSelectedColor(new java.awt.Color(255, 102, 153));
        btnAgregar.setkStartColor(new java.awt.Color(230, 142, 255));
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 170, 40));

        btnActualizar.setText("Actualizar");
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setkEndColor(new java.awt.Color(246, 119, 119));
        btnActualizar.setkHoverEndColor(new java.awt.Color(224, 98, 241));
        btnActualizar.setkHoverStartColor(new java.awt.Color(224, 98, 241));
        btnActualizar.setkSelectedColor(new java.awt.Color(180, 62, 218));
        btnActualizar.setkStartColor(new java.awt.Color(255, 153, 204));
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 170, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setkEndColor(new java.awt.Color(255, 226, 153));
        btnEliminar.setkHoverEndColor(new java.awt.Color(224, 98, 241));
        btnEliminar.setkHoverStartColor(new java.awt.Color(224, 98, 241));
        btnEliminar.setkSelectedColor(new java.awt.Color(180, 62, 218));
        btnEliminar.setkStartColor(new java.awt.Color(246, 119, 119));
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 170, 40));

        jtbLibreria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbLibreria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 820, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangle 14 (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangle 14 (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellas.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 510, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Degradado (3).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.k33ptoo.components.KButton btnActualizar;
    public com.k33ptoo.components.KButton btnAgregar;
    public com.k33ptoo.components.KButton btnEliminar;
    public com.k33ptoo.components.KButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbLibreria;
    public javax.swing.JTextField txtAutor;
    public javax.swing.JTextField txtCantidadPag;
    public javax.swing.JTextField txtEditorial;
    public javax.swing.JTextField txtEstadoLibro;
    public javax.swing.JTextField txtGenero;
    public javax.swing.JTextField txtISBM;
    public javax.swing.JTextField txtNombreLibro;
    public javax.swing.JTextField txtPublicacion;
    // End of variables declaration//GEN-END:variables
}