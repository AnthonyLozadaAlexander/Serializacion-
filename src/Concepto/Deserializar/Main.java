package Concepto.Deserializar;

import Concepto.Modelo.Usuario;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args){

        // Reconstruccion de Objeto
        Usuario user = reconstruirUsuario();
        if (user != null) {
            System.out.println(user.nombre);
            System.out.println(user.contraseña);
            user.saludar();
        }
    }

    static Usuario reconstruirUsuario() {
        Usuario user = null;
        try {
            FileInputStream fileIn = new FileInputStream("UsuarioInfo.ser"); // archivo
            ObjectInputStream in = new ObjectInputStream(fileIn); // permite leer objetos completos del archivo
            
            user = (Usuario) in.readObject(); // <--- ASI DE SIMPLE DEBE SER
            
            in.close(); // Cerrar ObjectIn para ahorrar Recursos
            fileIn.close(); // Cerrar FileIn para ahorrar Recursos
        } catch (IOException e) {
            System.out.println("Error Al Leer El Objeto: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error Clase No Encontrada: " + e.getMessage());
        }

        return user;
    }
}
