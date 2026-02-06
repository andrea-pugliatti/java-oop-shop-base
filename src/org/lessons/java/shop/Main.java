package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto product = new Prodotto("Scatola", "E' una scatola qualsiasi", new BigDecimal(12.00),
                new BigDecimal(22));

        System.out.println(product.getCodice());
        System.out.println(product.getNome());
        System.out.println(product.getNomeCompleto());
        System.out.println(product.getDescrizione());
        System.out.println(product.getPrezzo());
        System.out.println(product.getIva());
        System.out.println(product.getPrezzoBase());
        System.out.println(product.getPrezzoPieno());

    }
}
