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
    String contrase�a;

    public RegistroUsuario(String usuario, String contrase�a) {
        this.usuario = usuario;
        this.contrase�a = contrase�a;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrase�a() {
        return contrase�a;
    }


    @Override
    public String toString() {
        return usuario + "," + contrase�a;
    }
    
    public static RegistroUsuario fromString(String line){
        String vector[] = line.split(",");
        
        RegistroUsuario parsed = new RegistroUsuario(vector[0],vector[1]);
        return parsed;
    }

}
