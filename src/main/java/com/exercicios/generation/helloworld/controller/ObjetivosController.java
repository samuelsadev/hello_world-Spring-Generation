package com.exercicios.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

    @GetMapping
    public String objetivosDeAprendizagem() {
        return "\nNessa semana eu pretendo desenvolver mais meu" +
                " \nconhecimento em Spring, buscar fazer mais" +
                " \nprojetos pessoais e aproveitar ao máximo o bootcamp" +
                " \ne aplicar para vagas de emprego";
    }
}
