/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 
 */
public class ArchivoUsuario {

    ArrayList<RegistroUsuario> registros = new ArrayList<>();

    BufferedReader buffer;
    File file = new File("src\\artista\\Usuarios.txt");

    public BufferedReader getBuffer() {
        return buffer;
    }

    public void setBuffer(BufferedReader buffer) {
        this.buffer = buffer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public String Leer() {

        try {
            this.buffer = new BufferedReader(new FileReader(file));
            String line = this.buffer.readLine();
            if (line != null) {
                return line;
            } else {
                return "EOF";
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "EOF";
    }

    public void usuarios() {
        String line;
        do {
            line = this.Leer();
            if (!line.equals("EOF")) {
                registros.add(RegistroUsuario.fromString(line));
            }
        } while (!line.equals("EOF"));
    }

    public Boolean analizar(String user, String pass) {

        try (Scanner lector = new Scanner(file)) {
            // Mientras el archivo tenga otra línea.
            while (lector.hasNextLine()) {
                String line;
                line = lector.nextLine();
                String vector[] = line.split(",");
                if (user.equals(vector[0]) && pass.equals(vector[1])) {
                    return true;
                }

            }
            return false;

        } catch (Exception ex) {

        }
        return false;
    }
}
