package com.example.restaurante.service;

import java.util.List;

import com.example.restaurante.exceptions.ProprietarioSalvarException;
import com.example.restaurante.model.domain.Proprietario;

public interface ProprietarioService {

    Proprietario salvar(Proprietario proprietario) throws ProprietarioSalvarException; 
    void atualizar(Proprietario proprietario);
    void deletar(Proprietario proprietario);
    List<Proprietario> listar();
}