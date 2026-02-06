package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto() {
        Random r = new Random();
        this.codice = r.nextInt(10000);
        this.nome = "";
        this.descrizione = "";
        this.prezzo = new BigDecimal(0);
        this.iva = new BigDecimal(0);
    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
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
