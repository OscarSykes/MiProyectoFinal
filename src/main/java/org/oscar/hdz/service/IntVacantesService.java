package org.oscar.hdz.service;

import java.util.List;

import org.oscar.hdz.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IntVacantesService {
	//metodos abstractos
	public List<Vacante> obtenerTodas();
	public Vacante buscarPordId(Integer id);
	public void guardar(Vacante vacante);
	
	public void eliminar(Integer id);
	public Page<Vacante> buscarTodas(Pageable page);
}
