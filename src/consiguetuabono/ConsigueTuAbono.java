/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consiguetuabono;

import exceptions.EstadioLlenoException;
import exceptions.SocioAbonadoNoEncontrado;
import java.util.Scanner;

/**
 *
 * @author pedro Clase principal que gestiona el programa para conseguir abonos.
 */
public class ConsigueTuAbono {

    /**
     * Metodo principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
    Estadio estadio = new Estadio(35000, new SocioAbonado[1]);
    SocioRojo[] sociosRojos = new SocioRojo[50];
    SocioAbonado socioAbonado = new SocioAbonado();
    SocioRojo socioRojo = new SocioRojo();
    int opcionMenu = 0;

    do {
        try {
            System.out.println("------ABONATE AL SEVILLA FC--------");
            System.out.println("1. Hazte Socio Abonado");
            System.out.println("2. Hazte Socio Rojo");
            System.out.println("3. Mostrar Información de Socios Registrados en el Estadio");
            System.out.println("4. Mostrar Beneficios Socios Abonados");
            System.out.println("5. Mostrar lista de Socios Abonados");
            System.out.println("6. Mostrar Beneficios Socios Rojos");
            System.out.println("7. Mostrar lista de Socios Rojos");
            System.out.println("8. Darme de baja Socio Abonado");
            System.out.println("9. Darme de baja Socio Rojo");
            System.out.println("10. Salir");
            System.out.println("Ingrese una opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    agregarSocioAbonado(estadio);
                    break;
                case 2:
                    agregarSocioRojo(sociosRojos);
                    break;
                case 3:
                    System.out.println("El total de socios registrados en el estadio es de ---> " + estadio.getSociosRegistrados() + " personas.");
                    break;
                case 4:
                    socioAbonado.mostrarBeneficiosSocios();
                    break;
                case 5:
                    mostrarSociosAbonados(estadio);
                    break;
                case 6:
                    socioRojo.mostrarBeneficiosSocios();
                    break;
                case 7:
                    mostrarSociosRojos(sociosRojos);
                case 8:
                    eliminarSocioAbonado(estadio);
                    break;
                case 9:
                    eliminarSocioRojo(sociosRojos);
                    break;
                case 10:
                    System.out.println("Cerrando programa");
                    break;
            }
        } catch (EstadioLlenoException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (SocioAbonadoNoEncontrado e) {
            System.out.println("Error: " + e.getMessage());
        } 
    } while (opcionMenu != 10);
}

    /**
     * Método para agregar un socio abonado al estadio.
     *
     * @param estadio Estadio al que se agregará el socio abonado.
     * @throws exceptions.EstadioLlenoException
     */
    public static void agregarSocioAbonado(Estadio estadio) throws EstadioLlenoException {

        if (estadio.getSociosRegistrados() >= 10) {
            throw new EstadioLlenoException("No se pueden agregar más socios abonados. Puedes inscribirte como socio rojo.");
        }
        Scanner scanner = new Scanner(System.in);
        if (estadio.getSociosRegistrados() < 10) {
            System.out.println("Ingrese los datos del socio abonado:");
            System.out.print("DNI: ");
            String dni = scanner.next();
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido 1: ");
            String apellido1 = scanner.next();
            System.out.print("Apellido 2: ");
            String apellido2 = scanner.next();
            System.out.print("Fecha de nacimiento: ");
            String fechaNac = scanner.next();

            SocioAbonado socioAbonado = new SocioAbonado(dni, nombre, apellido1, apellido2, fechaNac);
            estadio.agregarSocio(socioAbonado);
        } else {
            throw new EstadioLlenoException("No se pueden agregar más socios abonados. Puedes inscribirte como socio rojo.");
        }
    }

    /**
     * Método para agregar un socio rojo.
     *
     * @param sociosRojos Array de socios rojos.
     */
    public static void agregarSocioRojo(SocioRojo[] sociosRojos) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sociosRojos.length; i++) {
            if (sociosRojos[i] == null) {
                System.out.println("Ingrese los datos del socio rojo:");
                System.out.print("DNI: ");
                String dni = scanner.next();
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Apellido 1: ");
                String apellido1 = scanner.next();
                System.out.print("Apellido 2: ");
                String apellido2 = scanner.next();
                System.out.print("Fecha de nacimiento: ");
                String fechaNac = scanner.next();

                sociosRojos[i] = new SocioRojo(dni, nombre, apellido1, apellido2, fechaNac);
                System.out.println("Socio rojo agregado correctamente.");
                return;
            }
        }
        System.out.println("No se pueden agregar más socios rojos.");
    }

    /**
     * Método para mostrar la lista de socios abonados.
     *
     * @param estadio Estadio que contiene los socios abonados.
     */
    public static void mostrarSociosAbonados(Estadio estadio) {
        SocioAbonado[] sociosAbonados = estadio.getSocios();
        System.out.println("Lista de Socios Abonados:");
        for (SocioAbonado socio : sociosAbonados) {
            if (socio != null) {
                System.out.println(socio);
            }
        }
    }

    /**
     * Método para mostrar la lista de socios rojos.
     *
     * @param sociosRojos Array de socios rojos.
     */
    public static void mostrarSociosRojos(SocioRojo[] sociosRojos) {
        System.out.println("Lista de Socios Rojos: ");
        for (SocioRojo sociosRojo : sociosRojos) {
            if (sociosRojo != null) {
                System.out.println(sociosRojo);
            }
        }
    }

    /**
     * Método para eliminar a un socio de la lista de socios abonados.
     *
     * @param estadio Se le pasa el estadio que tiene el array de socios
     * abonados que entran al estadio.
     */
    public static void eliminarSocioAbonado(Estadio estadio) throws SocioAbonadoNoEncontrado {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de socio abonado que desea eliminar: ");
        int numSocio = scanner.nextInt();

        SocioAbonado[] sociosAbonados = estadio.getSocios();
        for (int i = 0; i < sociosAbonados.length; i++) {
            if (sociosAbonados[i] != null && sociosAbonados[i].getNumSocio() == numSocio) {
                sociosAbonados[i] = null;
                System.out.println("Socio abonado eliminado correctamente.");
                return;
            }
        }

        throw new SocioAbonadoNoEncontrado("No se encontró un socio abonado con el número proporcionado.");
    }

    public static void eliminarSocioRojo(SocioRojo[] sociosRojos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de socio rojo que desea eliminar: ");
        int numSocio = scanner.nextInt();

        for (int i = 0; i < sociosRojos.length; i++) {
            if (sociosRojos[i] != null && sociosRojos[i].getNumSocio() == numSocio) {
                sociosRojos[i] = null;
                System.out.println("Socio rojo eliminado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró un socio rojo con el número proporcionado.");
    }
}
