package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random r = new Random();
        this.codice = r.nextInt(10000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoPieno() {
        if (prezzo != null && iva != null) {
            return this.prezzo.add(this.prezzo.multiply(this.iva).divide(new BigDecimal(100))).setScale(2,
                    RoundingMode.DOWN);
        }
        return null;
    }

    public String getNomeCompleto() {
        if (prezzo != null && iva != null) {
            return this.codice + "-" + this.nome;
        }
        return null;
    }
}
