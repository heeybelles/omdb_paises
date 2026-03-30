package com.example.omdb_titulos.controller;

import com.example.omdb_titulos.model.Pais;
import com.example.omdb_titulos.service.OmdbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaisController {

    private final OmdbService omdbService;

    public PaisController(OmdbService omdbService) {
        this.omdbService = omdbService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/search")
    public String buscar(@RequestParam("name") String name, Model model) {
        Pais result = omdbService.searchForName(name);
        model.addAttribute("name", result);
        return "resultado";
    }
}
