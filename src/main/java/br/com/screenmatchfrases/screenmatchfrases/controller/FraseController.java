package br.com.screenmatchfrases.screenmatchfrases.controller;

import br.com.screenmatchfrases.screenmatchfrases.model.Frase;
import br.com.screenmatchfrases.screenmatchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public Frase obterFrase(){
        return servico.obterFrase();
    }
}
