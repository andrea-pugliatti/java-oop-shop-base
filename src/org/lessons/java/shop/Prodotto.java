package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        Random r = new Random();
        this.codice = r.nextInt(10000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double prezzoBase() {
        return this.prezzo;
    }

    public double prezzoPieno() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

    public String nomeCompleto() {
        return this.codice + "-" + this.nome;
    }

}
