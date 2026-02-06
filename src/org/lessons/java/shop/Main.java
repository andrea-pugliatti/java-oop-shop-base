package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product = new Prodotto("Scatola", "E' una scatola qualsiasi", 12.00, 22.00);

        System.out.println(product.codice);
        System.out.println(product.nome);
        System.out.println(product.nomeCompleto());
        System.out.println(product.descrizione);
        System.out.println(product.prezzo);
        System.out.println(product.iva);
        System.out.println(product.prezzoBase());
        System.out.println(product.prezzoPieno());

    }
}
