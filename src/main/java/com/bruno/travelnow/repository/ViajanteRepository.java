package com.bruno.travelnow.repository;

import java.util.List;

import com.bruno.travelnow.models.Viajante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ViajanteRepository extends JpaRepository<Viajante, Long> {
	List<Viajante> findByViagemId(Long viagemId);
}  

