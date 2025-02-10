package com.valepan.ProdottiNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ordini")

public class OrdineController {

    @Autowired
    private OrdineService ordineService;

    @PostMapping("/totale")
    public double calculateTotal(@RequestBody Ordine ordine) {
        return ordineService.calcolaTotale(ordine);
    }
}
