package Concepto.Modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    public String nombre;
    public String contraseña;
    private static final long serialVersionUID = 1L;

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
