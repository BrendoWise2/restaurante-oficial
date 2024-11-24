package com.example.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurante.exceptions.ProprietarioSalvarException;
import com.example.restaurante.model.domain.Proprietario;
import com.example.restaurante.service.ProprietarioService;

@RestController
@RequestMapping("/proprietario")
public class ProprietarioController {

    @Autowired
    private ProprietarioService proprietarioService;

    @PostMapping
    public Proprietario salvar(@RequestBody Proprietario proprietario) throws ProprietarioSalvarException {
        
        return proprietarioService.salvar(proprietario);
    }

    @GetMapping
    public List<Proprietario> listar() {
        return proprietarioService.listar();
    }

}
