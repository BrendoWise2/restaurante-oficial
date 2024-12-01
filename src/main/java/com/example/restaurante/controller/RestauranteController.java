package com.example.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurante.exceptions.RestauranteSalvarException;
import com.example.restaurante.model.domain.Restaurante;
import com.example.restaurante.service.RestauranteService;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;


    @PostMapping                // ESSE VALID AQUI?? \\LÁ VAI
    public Restaurante salvar(@Valid @RequestBody Restaurante restaurante) throws RestauranteSalvarException {
        return restauranteService.salvarRestaurante(restaurante);
    }

                            //TESTANDO O GIT GALERA, TESTE TBM E ESCREVA ABAIXO COM O NOME - BRENDO
                            // TESTANDO 2
                            // ALGUMA COISA AÍ

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteService.listarRestaurantes();
    }

}