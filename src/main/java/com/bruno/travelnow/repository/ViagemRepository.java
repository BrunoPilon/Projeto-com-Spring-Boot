package com.bruno.travelnow.repository;

import java.util.List;

import com.bruno.travelnow.models.Viagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {
	List<Viagem> findByDestino(String destino);
} 