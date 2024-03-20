/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consiguetuabono;

/**
 *
 * @author pedro Clase que representa un estadio.
 */
public class Estadio {

    private static String nombre = "Ramón Sanchez-Pizjuan";
    protected int capacidad;
    protected SocioAbonado[] socios;

    /**
     * Constructor con parámetros.
     *
     * @param capacidad Capacidad del estadio.
     * @param socios Array de socios abonados.
     */
    public Estadio(int capacidad, SocioAbonado[] socios) {
        this.capacidad = capacidad;
        this.socios = socios;
    }

    /**
     * Método para obtener el nombre del estadio.
     *
     * @return Nombre del estadio.
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la capacidad del estadio.
     *
     * @return Capacidad del estadio.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Método para obtener el array de socios abonados.
     *
     * @return Array de socios abonados.
     */
    public SocioAbonado[] getSocios() {
        return socios;
    }

    /**
     * Método para contar los socios registrados en el estadio.
     *
     * @return Número de socios registrados.
     */
    public int getSociosRegistrados() {
        int contador = 0;
        for (Socio socio : socios) {
            if (socio != null) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Método para agregar socios en el estadio pasandole el socio en cuestion como parametro de entrada.
     *
     * @param socio Socio abonado a agregar.
     */
    public void agregarSocio(SocioAbonado socio) {
        if (getSociosRegistrados() < capacidad) {
            for (int i = 0; i < capacidad; i++) {
                if (socios[i] == null) {
                    socios[i] = socio;
                    System.out.println("Socio agregado correctamente al estadio.");
                    return;
                }
            }
        }
    }
}
