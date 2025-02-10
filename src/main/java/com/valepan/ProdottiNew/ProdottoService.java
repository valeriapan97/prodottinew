package com.valepan.ProdottiNew;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdottoService {

    List<Prodotto> listaProdotti = new ArrayList<>();

    public void aggiungiProdotti() {
        Prodotto prod1 = new Prodotto(1,"Latte",1.99);
        Prodotto prod2 = new Prodotto(2,"Vino",10.99);
        Prodotto prod3 = new Prodotto(3,"Succo di frutta",1.50);

        listaProdotti.add(prod1);
        listaProdotti.add(prod2);
        listaProdotti.add(prod3);
    }

    public List<Prodotto> listaProdotti() {
        return listaProdotti;
    }

    public Prodotto getProdottoById(int id) {
        for (Prodotto prodotto : listaProdotti) {
            if (prodotto.getId() == id) {
                return prodotto;
            }
    }
        return null;
}

    public List<Prodotto> getProdottiById(List<Integer> ids) {
        List<Prodotto> prodotti = new ArrayList<>();
        for (int id : ids) {
            Prodotto prodotto = getProdottoById(id);
            if (prodotto != null) {
                prodotti.add(prodotto);
            }
        }
        return prodotti;
    }

}
