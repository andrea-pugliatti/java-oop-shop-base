package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto product = new Prodotto("Scatola", "E' una scatola qualsiasi", new BigDecimal(12.00),
                new BigDecimal(22));

        System.out.println(product.codice);
        System.out.println(product.nome);
        System.out.println(product.getNomeCompleto());
        System.out.println(product.descrizione);
        System.out.println(product.prezzo);
        System.out.println(product.iva);
        System.out.println(product.getPrezzoBase());
        System.out.println(product.getPrezzoPieno());

    }
}
