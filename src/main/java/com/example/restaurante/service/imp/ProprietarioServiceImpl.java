package com.example.restaurante.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurante.exceptions.ProprietarioSalvarException;
import com.example.restaurante.model.domain.Proprietario;
import com.example.restaurante.repository.ProprietarioRepository;
import com.example.restaurante.service.ProprietarioService;

@Service
public class ProprietarioServiceImpl implements ProprietarioService{

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @Override
    public Proprietario salvar(Proprietario proprietario) throws ProprietarioSalvarException {
        var proprietarioSalvo = proprietarioRepository.findByCpf(proprietario.getCpf());
            if(proprietarioSalvo.isPresent()) {
                throw new ProprietarioSalvarException("Este proprietário já está registrado");
            }
            return proprietarioRepository.save(proprietario);
    }

    @Override
    public void atualizar(Proprietario proprietario) {
        proprietarioRepository.save(proprietario);
    }

    @Override
    public void deletar(Proprietario proprietario) {
        proprietarioRepository.delete(proprietario);
    }

    @Override
    public List<Proprietario> listar() {
        return proprietarioRepository.findAll();
    }
}

