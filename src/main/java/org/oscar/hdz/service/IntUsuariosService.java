package org.oscar.hdz.service;

import java.util.List;

import org.oscar.hdz.model.Usuario;

public interface IntUsuariosService {
	
	public List<Usuario> obtenerTodas();
	public Usuario buscarPorId(Integer idUsuario);
	public void guardar(Usuario usuario);
	public void eliminar(Integer idUsuario);
}
