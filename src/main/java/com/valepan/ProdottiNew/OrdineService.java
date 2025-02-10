package com.valepan.ProdottiNew;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrdineService {

    @Autowired
    private ProdottoService prodottoService;

    public double calcolaTotale(Ordine ordine) {

        List<Integer> idProdotti = ordine.getIdProdotti();

        List<Prodotto> listaProdotti = prodottoService.getProdottiById(idProdotti);

        double totale = 0;
        for (Prodotto prodotto : listaProdotti) {
            totale += prodotto.getPrezzo();
        }

        return totale;
    }



}

//    private final RestTemplate restTemplate = new RestTemplate();
//    String url = "http://localhost:8081/listaProdotti";
//
//    public double calcolaTotale(List<Integer> idProdotti) {
//        double totale = 0.0;
//
//        List<Prodotto> listaProdotti = restTemplate.getForObject(url, List.class);
//
//        for (int id : idProdotti) {
//            for (Prodotto prodotto : listaProdotti) {
//                if (prodotto.getId() == id) {
//                    totale += prodotto.getPrezzo();
//                }
//            }
//        }
//
//        return totale;
//    }
