package com.ejer.itemseparator;

import com.ejer.consola.Consola;

/**
 * Clase que almacena
 */
public class ItemSeparator {

    private String name;
    private Double price;
    private Integer quantity;

    /**
     * Número de atributos que almacena la clase para construirla
     */
    private static int NUMATRIBUTOS = 3;

    /**
     * Index para el parámetro name en el rawInput
     */
    private static int ITEMNAME = 0;
    /**
     * Index para el parámetro price en el rawInput
     */
    private static int ITEMPRICE = 1;
    /**
     * Index para el parámetro quantity en el rawInput
     */
    private static int ITEMQUANTITY = 2;


    /**
     * Constructor que acepta una cadena de texto para darle valores a los atributos de su clase.
     * Formato del String: nombre$$##precio
     * @param rawInput
     * @throws IllegalArgumentException
     */
    public ItemSeparator(final String rawInput) throws IllegalArgumentException {
        if(rawInput == null) {
            throw new IllegalArgumentException("Clase ItemSeparator: ItemSeparator(String rawInput): rawInput es null");
        }
        final String[] valores = rawInput.split("\\$\\$\\#\\#");
        if(valores.length != NUMATRIBUTOS)  {
            throw new IllegalArgumentException("Clase ItemSeparator: ItemSeparator(String rawInput): se han introducido más valores de los que almacena la clase");
        }

        name = valores[ITEMNAME];
        price = Double.valueOf(valores[ITEMPRICE]);
        quantity = Integer.valueOf(valores[ITEMQUANTITY]); //Number format

    }

    public String devolverMetadatos() {
        StringBuilder stringMetadatos = new StringBuilder();
        stringMetadatos.append("Nombre: " + this.getName() + Consola.RETORNO_CARRO);
        stringMetadatos.append("Precio: " + this.getPrice() + Consola.RETORNO_CARRO);
        stringMetadatos.append("Cantidad: " + this.getQuantity() + Consola.RETORNO_CARRO);

        return  stringMetadatos.toString();
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
