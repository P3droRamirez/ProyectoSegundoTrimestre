/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consiguetuabono;

/**
 *
 * @author pedro Clase abstracta que representa a una persona.
 */
public abstract class Persona {

    //Propiedades
    protected static int contador = 1;
    protected int numSocio;
    protected String dni;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String fechaNac;

    /**
     * Constructor por defecto.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros.El numero de socio se le asigna autoincrementalmente en funcion del registro de la persona.
     *
     * @param dni DNI de la persona.
     * @param nombre Nombre de la persona.
     * @param apellido1 Primer apellido de la persona.
     * @param apellido2 Segundo apellido de la persona.
     * @param fechaNac Fecha de nacimiento de la persona.
     */
    public Persona(String dni, String nombre, String apellido1, String apellido2, String fechaNac) {
        this.numSocio = contador++;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
    }

    /**
     * Método para obtener el número de socio.
     *
     * @return El número de socio.
     */
    public int getNumSocio() {
        return numSocio;
    }

    /**
     * Método para representar la información de la persona.
     *
     * @return Cadena de texto con la información de la persona.
     */
    @Override
    public String toString() {
        return "Numero de socio: " + numSocio + ", dni: " + dni + ", nombre: " + nombre + ", apellido1: " + apellido1 + ", apellido2: " + apellido2 + ", fechaNac: " + fechaNac;
    }

}
