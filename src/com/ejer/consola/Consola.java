package com.ejer.consola;

import com.ejer.itemseparator.ItemSeparator;

import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 * Lee las entradas del usuario para realizar las operacones necesarias
 */
public class Consola {
    //Formato de texto
    /**
     * Utilizada al imprimir por pantalla caracteres.
     * Hace que texto escrito tengan un fondo amarillo.
     */
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    /**
     * Utilizada al imprimir por pantalla caracteres.
     * Hace que texto escrito tenga el formato por defecto.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * Retorno de carro proporcionado por el sistema que se esté utilizando
     */
    public static final String RETORNO_CARRO = System.getProperty("line.separator");


    /**
     * Contructor de Consola.
     * No realiza ninguna operación.
     */
    public Consola() {
    }


    /**
     * Inicia la interfaz de la consola.
     * Lee la entrada del usuario y realiza las operaciones necesarias
     */
    public void iniciarConsola() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ejercicio 5: ItemDSeparator.");
            System.out.println("Inserte una cadena para dar valores a la clase ItemSeparartor");
            System.out.println("Formato: \'nombre$$##precioDecimal$$##cantidadInt\'");
            String rawInput = scanner.next();

            ItemSeparator item = new ItemSeparator(rawInput);
            System.out.println("Valores almacenados:");
            System.out.println(item.devolverMetadatos());

            //Ocurre cuando metemos un caracter dierente a un número
        }  catch(NumberFormatException e) {
            System.out.println(ANSI_YELLOW_BACKGROUND + "Formato numérico erroneo." + ANSI_RESET);
            System.out.println("Precio debe de estar separado por un '.' sus decimales");
            System.out.println("Cantidad debe de ser un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_YELLOW_BACKGROUND + "Formato incorrecto de la cadena" + ANSI_RESET);

        }

        System.out.println("Saliendo del programa");

    }
}