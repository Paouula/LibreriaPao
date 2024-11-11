package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.frmRegistro;

public class ctrlRegistro implements MouseListener{
    
    //Llamar las otras capas
    private Usuario modelo;
    private frmRegistro vista;
    
    //Constructor 
    public ctrlRegistro (Usuario modelo, frmRegistro vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnRegistrar.addMouseListener(this);
        vista.btnIrLogin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnRegistrar){
        modelo.setNombre_usuario(vista.txtNombreUsuario.getText());
        modelo.setApellido_usuario(vista.txtApellidoUsuario.getText());
        modelo.setCorreo_usuario(vista.txtCorreoUsuario.getText());
        modelo.setEdad_usuario(Integer.parseInt(vista.txtEdadUsuario.getText()));
        modelo.setContra_usuario(vista.txtContraUsuario.getText());
        
        //Alerta 
            JOptionPane.showMessageDialog(vista, "Usuario Guardado");
        }
        
        //Clic al botón de Ir Al Login
        if(e.getSource() == vista.btnIrLogin){
            vista.frmLogin.initFrmLogin();
            vista.dispose();
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
