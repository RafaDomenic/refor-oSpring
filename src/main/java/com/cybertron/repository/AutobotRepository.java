package com.cybertron.repository;

import com.cybertron.model.Autobot;
import java.util.ArrayList;
import java.util.List;
/**
 * Guarda os Autobots em memória.
 *
 * <p>Em um sistema real isso seria um banco de dados. Aqui é uma
 * lista, porque o objetivo da aula é entender as ferramentas,
 * não JDBC.</p>
 */
public class AutobotRepository {
    private final List<Autobot> autobots = new ArrayList<>();
    public void salvar(Autobot autobot) {
        autobots.add(autobot);
    }
    public List<Autobot> listarTodos() {
        return autobots;
    }
}