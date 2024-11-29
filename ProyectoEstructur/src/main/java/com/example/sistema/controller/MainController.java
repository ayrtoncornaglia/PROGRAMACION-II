package com.example.sistema.controller;

import com.example.sistema.service.ServicioOrdenamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ServicioOrdenamiento servicioOrdenamiento;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ordenar")
public String ordenar(@RequestParam("metodo") String metodo, Model model) {
    List<Integer> lista = Arrays.asList(5, 2, 9, 1, 7, 3);
    List<Integer> resultado = servicioOrdenamiento.ordenar(metodo, lista);
    model.addAttribute("resultado", resultado);
    return "resultado";
}
}
