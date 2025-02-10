package com.valepan.ProdottiNew;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdottoController {

    @Autowired
    ProdottoService prodottoService;

    @PostMapping("/aggiungiProdotti")
    public String aggiungiProdotti() {
        prodottoService.aggiungiProdotti();
        return "Prodotti aggiunti";

    }

    @GetMapping("/listaProdotti")
    public List<Prodotto> listaProdotti() {
        return prodottoService.listaProdotti();

    }
}