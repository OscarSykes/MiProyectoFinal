package org.oscar.hdz.service;

import java.awt.print.Pageable;
import java.util.LinkedList;
import java.util.List;

import org.oscar.hdz.model.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CategoriasServiceImp implements IntCategoriasService{
	
	List<Categoria> lista = null;
	
	public CategoriasServiceImp() {
		
		lista =new LinkedList<Categoria>();
		
		Categoria c1 = new Categoria();	
		c1.setId(1);
		c1.setNombre("Contabilidad");
		c1.setDescripcion("Relacionado con contabilidad");
		lista.add(c1);
		
		Categoria c2 = new Categoria();		
		c2.setId(2);
		c2.setNombre("Técnicos de computación");
		c2.setDescripcion("Relacionado con mantenimiento de redes");
		lista.add(c2);
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNombre("Ingenieros");
		c3.setDescripcion("Ingenieros de todas las áreas");
		lista.add(c3);
		
		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setNombre("Informatica");
		c4.setDescripcion("Relacionado con las computadoras");
		lista.add(c4);
		
		Categoria c5 = new Categoria();
		c5.setId(5);
		c5.setNombre("Diseño");
		c5.setDescripcion("Relacionado con el diseño de los interiores");
		lista.add(c5);
	}
	
	@Override
	public List<Categoria> obtenerTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		for(Categoria categoria : lista) {
			if(categoria.getId() == idCategoria) {
				return categoria;
			}
		}
		return null;
		
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Categoria> buscarTodas(org.springframework.data.domain.Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}


}
