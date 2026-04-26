package Concepto.Modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    public String nombre;
    public String contraseña;
    private static final long serialVersionUID = 1L; // Esto es para asegurar que la clase sea compatible con la version de serializacion, no es obligatorio pero recomendado

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
