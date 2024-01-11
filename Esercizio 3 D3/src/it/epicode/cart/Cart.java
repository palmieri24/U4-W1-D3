package it.epicode.cart;

import it.epicode.article.Article;
import it.epicode.client.Client;

public class Cart {
    private Client cliente;
    private Article[] elencoArticoli;

    public Cart(Client c) {
        this.cliente = c;
        this.elencoArticoli = new Article[0];
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Article[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(Article[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        double totale = 0;
        for (int i = 0; i < elencoArticoli.length; i++) {
            int disponibilita = elencoArticoli[i].getNumeroPezziInMagazzino();
            System.out.println(elencoArticoli[i].getNumeroPezziInMagazzino());
            if (disponibilita == 0) {
                System.out.println("Abbiamo terminato la disponibilità di: " + elencoArticoli[i].getCodice());
                continue;
            } else {
                totale += elencoArticoli[i].getPrezzo();
            }

        }
        return totale;
    }

}
