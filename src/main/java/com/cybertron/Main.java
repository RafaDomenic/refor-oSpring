package com.cybertron;

import com.cybertron.repository.AutobotRepository;
import com.cybertron.service.AutobotService;

/**
 * Ponto de entrada do sistema, sem Maven e sem Spring.
 */
public class Main {

    public static void main(String[] args) {

        // Montagem manual: eu crio cada peça e encaixo na mão.
        AutobotRepository repository = new AutobotRepository();
        AutobotService service = new AutobotService(repository);

        service.cadastrar("Optimus Prime", 850.0);
        service.cadastrar("Bumblebee", 320.0);

        service.listarTodos().forEach(a ->
                System.out.println(a.getNome() + " - " + a.getEnergon()));
    }
}