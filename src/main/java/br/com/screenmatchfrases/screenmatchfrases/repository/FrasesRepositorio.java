package br.com.screenmatchfrases.screenmatchfrases.repository;

import br.com.screenmatchfrases.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepositorio extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase buscaFrase();
}
