package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.frmLogin;


public class ctrlLogin implements MouseListener{
   
    //Llamas las otras capas
    Usuario modelo;
    frmLogin vista;

    //2-Constructor 
    public ctrlLogin(Usuario Modelo, frmLogin Vista) {
        this.modelo = Modelo;
        this.vista = Vista;

        vista.btnIngresar.addMouseListener(this);
        vista.btnIrRegistro.addMouseListener(this);
    }

    //Metodos
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            modelo.setCorreo_usuario(vista.txtCorreoLogin.getText());
            modelo.setContra_usuario(modelo.convertirSHA256(vista.txtContraLogin.getText()));

                        
            boolean comprobar = modelo.iniciarSesion();

   
            if (comprobar == true) {
                JOptionPane.showMessageDialog(vista,"Se ingreso de forma correcta");
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");

            }
        }
        
        if(e.getSource() == vista.btnIrRegistro){
            vista.frmRegistro.initFrmRegistro();
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
