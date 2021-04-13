package org.oscar.hdz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.oscar.hdz.model.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {

	public List<Vacante> findByEstatus(String estatus);
	public List<Vacante> findByEstatusAndDestacado(String estatus, Integer destacado);
}
