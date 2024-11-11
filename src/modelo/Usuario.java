package modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class Usuario {
    
    //Parametros 
    private String UUID_Usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String correo_usuario;
    private String contra_usuario;
    private int edad_usuario;
    
    //Getters y Setters 
    
    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public void setContra_usuario(String contra_usuario) {
        this.contra_usuario = contra_usuario;
    }

  

    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public String getContra_usuario() {
        return contra_usuario;
    }
    
     public void setEdad_usuario(int edad_usuario) {
        this.edad_usuario = edad_usuario;
    }

    public int getEdad_usuario() {
        return edad_usuario;
    }

    
    //Metodos
    
    public void GuardarUsuario() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addLibreria = conexion.prepareStatement("INSERT INTO tb_ExtraUsuario(UUID_Usuario, nombre_usuario, apellido_usuario, correo_usuario, contra_usuario, edad_usuario) VALUES (?, ?, ?, ?, ?, ?)");
            //Establecer valores de la consulta SQL
            addLibreria.setString(1, UUID.randomUUID().toString());
            addLibreria.setString(2, getNombre_usuario());
            addLibreria.setString(3, getApellido_usuario());
            addLibreria.setString(4, getCorreo_usuario());
            addLibreria.setString(5, getContra_usuario());
            addLibreria.setInt(6, getEdad_usuario()); 
           
            //Ejecutar la consulta
            addLibreria.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
       
       
       public boolean iniciarSesion() {
        //Obtenemos la conexión a la base de datos
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;

        try {
            //Preparamos la consulta SQL para verificar el usuario
            String sql = "SELECT * FROM tbUsuario WHERE Correo = ? AND Contraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, getCorreo_usuario());
            statement.setString(2, getContra_usuario());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                resultado = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error en el modelo: método iniciarSesion " + ex);
        }

        return resultado;
    }
       //Contraseña 
       public String convertirSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	}
	catch (NoSuchAlgorithmException e) {
		System.out.println(e.toString());
		return null;
	}
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
 
	for(byte b : hash) {
		sb.append(String.format("%02x", b));
	}
 
	return sb.toString();
}
   
    
}


