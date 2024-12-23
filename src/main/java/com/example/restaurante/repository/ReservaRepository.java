package com.example.restaurante.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurante.model.domain.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Optional<Reserva> findByData(LocalDateTime data);
}
