package com.exercicios.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

    @GetMapping
    public String bsmGeneration() {
        return "\nResponsabilidade Pessoal," +
                " \nMentalidade de Crescimento," +
                " \nOrientação para o Futuro," +
                " \nPersistência, Comunicação," +
                " \nTrabalho em Equipe," +
                " \nProatividade," +
                " \nOrientação ao Detalhe";
    }
}
