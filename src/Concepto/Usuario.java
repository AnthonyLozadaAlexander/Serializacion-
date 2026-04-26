package Concepto;

import java.io.Serializable;

public class Usuario implements Serializable {

    String nombre;
    String contraseña;

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
