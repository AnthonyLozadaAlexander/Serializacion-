package Concepto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    static void main(String[] args) throws IOException {

        Usuario user = new Usuario();
        user.nombre = "Pepito";
        user.contraseña = "1234";

        //user.saludar();

        FileOutputStream fileOut = new FileOutputStream("UsuarioInfo.ser"); // archivo
        ObjectOutputStream out = new ObjectOutputStream(fileOut); // permite escribir objetos completos en el archivo
        out.writeObject(user); // escribe el objeto user en el archivo
        out.close(); // cierra el stream de objetos
        fileOut.close(); // cierra el stream de archivo // ahorrar recursos

        System.out.println("El Objeto Ha Sido Guardado");

    }
}
