package com.valepan.ProdottiNew;

import java.util.List;

public class Ordine {

    private List<Integer> idProdotti;

    public Ordine(List<Integer> idProdotti) {
        this.idProdotti = idProdotti;
    }

    public Ordine() {}

    public List<Integer> getIdProdotti() {
        return idProdotti;
    }

    public void setIdProdotti(List<Integer> idProdotti) {
        this.idProdotti = idProdotti;
    }
}
