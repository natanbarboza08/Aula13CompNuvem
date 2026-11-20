package com.senai.aula07api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Aula 13 - API de Produtos\n" + //
                "\n" + //
                "Computação em Nuvem - SENAI 2026\n" + //
                "\n" + //
                "Desenvolvido por: professor Daniel Vieira\n" + //
                "\n" + //
                "API desenvolvida com Java e Spring Boot\n" + //
                "\n" + //
                "Para acessar a lista de produtos, acesse a rota: /produtos\n" + //
                "\n" + //
                "Para acessar um produto específico, acesse a rota: /produtos/{id}\n" + //
                "\n" + //
                "Exemplo: /produtos/1\n" + //
                "\n" + //
                "Curso Tecnólogo em Análise e Desenvolvimento de Sistemas\n" + //
                "\n" + //
                "UniSenai - 2026";
    }
}