/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artista;

/**
 *
 * @author Flavio A. Pareja
 */
public class RegistroUsuario {
  
    String usuario;
    String contraseña;

    public RegistroUsuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }


    @Override
    public String toString() {
        return usuario + "," + contraseña;
    }
    
    public static RegistroUsuario fromString(String line){
        String vector[] = line.split(",");
        
        RegistroUsuario parsed = new RegistroUsuario(vector[0],vector[1]);
        return parsed;
    }

}
