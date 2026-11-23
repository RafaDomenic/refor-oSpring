package com.cybertron.service;

import com.cybertron.model.Autobot;
import com.cybertron.repository.AutobotRepository;
import java.util.List;

/**
 * Regras de negócio da base dos Autobots.
 *
 * <p>Repare que esta classe precisa de um AutobotRepository para
 * funcionar. Isso é uma DEPENDÊNCIA.</p>
 */
public class AutobotService {

    private final AutobotRepository repository;

    public AutobotService(AutobotRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(String nome, double energon) {
        repository.salvar(new Autobot(nome, energon));
    }

    public List<Autobot> listarTodos() {
        return repository.listarTodos();
    }
}