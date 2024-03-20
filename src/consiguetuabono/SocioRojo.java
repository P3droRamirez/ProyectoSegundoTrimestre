/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consiguetuabono;

/**
 *
 * @author pedro Clase que representa a un socio rojo.
 */
public class SocioRojo extends Persona implements Socio {

    /**
     * Constructor por defecto.
     */
    public SocioRojo() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param dni DNI del socio rojo.
     * @param nombre Nombre del socio rojo.
     * @param apellido1 Primer apellido del socio rojo.
     * @param apellido2 Segundo apellido del socio rojo.
     * @param fechaNac Fecha de nacimiento del socio rojo.
     */
    public SocioRojo(String dni, String nombre, String apellido1, String apellido2, String fechaNac) {
        super(dni, nombre, apellido1, apellido2, fechaNac);
    }

    /**
     * Método para representar la información del socio rojo.
     *
     * @return Cadena de texto con la información del socio rojo.
     */
    @Override
    public String toString() {
        return "Socio Rojo " + super.toString();
    }

    /**
     * Método para mostrar los beneficios de ser socio rojo.
     */
    @Override
    public void mostrarBeneficiosSocios() {
        System.out.println("Beneficios de los Socios Rojos:");
        System.out.println("- 20% de descuento en la tienda del club.");
        System.out.println("- 15% de descuento en las entradas disponibles para los partidos.");
        System.out.println("- Participación en sorteos de camisetas firmadas por los jugadores.");
    }

}
