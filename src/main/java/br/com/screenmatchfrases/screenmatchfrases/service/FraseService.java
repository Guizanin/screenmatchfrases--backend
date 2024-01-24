package br.com.screenmatchfrases.screenmatchfrases.service;

import br.com.screenmatchfrases.screenmatchfrases.model.Frase;
import br.com.screenmatchfrases.screenmatchfrases.repository.FrasesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FrasesRepositorio repositorio;

    public Frase obterFrase(){
        return repositorio.buscaFrase();
    }
}
