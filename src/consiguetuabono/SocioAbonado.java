/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consiguetuabono;

/**
 *
 * @author pedro Clase que representa a un socio abonado.
 */
public class SocioAbonado extends Persona implements Socio {

    protected static int contador = 1;
    protected int numAsiento;

    /**
     * Constructor por defecto.
     */
    public SocioAbonado() {

    }

    /**
     * Constructor con parámetros.El numero de asiento se le asigna autoincrementalmente en funcion de la disponibilidad
     *
     * @param dni DNI del socio abonado.
     * @param nombre Nombre del socio abonado.
     * @param apellido1 Primer apellido del socio abonado.
     * @param apellido2 Segundo apellido del socio abonado.
     * @param fechaNac Fecha de nacimiento del socio abonado.
     */
    public SocioAbonado(String dni, String nombre, String apellido1, String apellido2, String fechaNac) {
        super(dni, nombre, apellido1, apellido2, fechaNac);
        this.numAsiento = contador++;
    }

    /**
     * Método para representar la información del socio abonado.
     *
     * @return Cadena de texto con la información del socio abonado.
     */
    @Override
    public String toString() {
        return "Socio Abonado con numero de asiento : " + numAsiento + super.toString();
    }

    /**
     * Método para mostrar los beneficios de ser socio abonado.
     */
    @Override
    public void mostrarBeneficiosSocios() {
        System.out.println("Beneficios de los Socios Abonados:");
        System.out.println("Acceso al estadio para ver al primer equipo.");
        System.out.println("20% de descuento en la tienda del club.");
    }

}
