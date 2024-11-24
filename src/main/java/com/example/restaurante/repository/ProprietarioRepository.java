package com.example.restaurante.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurante.model.domain.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    Optional<Proprietario> findByCpf(String cpf);

}
