package org.oscar.hdz.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.oscar.hdz.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImp implements IntUsuariosService {

	private List <Usuario> lista = null;
	
	public UsuariosServiceImp() {
		lista = new LinkedList<Usuario>();
		try {
			Usuario u1 = new Usuario();
			u1.setId(1);
			u1.setNombre("Oscar");
			u1.setUsername("oscar10");
			u1.setPassword("123456");
			u1.setEmail("oscar10@gmail.com");
			u1.setEstatus(1);
			u1.setFechaRegistro(LocalDate.parse("07-01-2021",DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u1);
			//********************************************************
			Usuario u2 = new Usuario();
			u2.setId(2);
			u2.setNombre("Leonel");
			u2.setUsername("leonel11");
			u2.setPassword("1234567");
			u2.setEmail("leonel@gmail.com");
			u2.setEstatus(1);
			u2.setFechaRegistro(LocalDate.parse("07-02-2021",DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u2);
			//********************************************************
			Usuario u3 = new Usuario();
			u3.setId(2);
			u3.setNombre("Daniel");
			u3.setUsername("daniel11");
			u3.setPassword("12345678");
			u3.setEmail("dany@gmail.com");
			u3.setEstatus(0);
			u3.setFechaRegistro(LocalDate.parse("18-02-2021",DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u3);
			//********************************************************
			
		}catch(DateTimeParseException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	@Override
	public List<Usuario> obtenerTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuario buscarPorId(Integer idUsuario) {
		// TODO Auto-generated method stub
		for(Usuario usuario : lista ) {
			if(usuario.getId() == idUsuario) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		lista.add(usuario);
	}

	@Override
	public void eliminar(Integer idUsuario) {
		// TODO Auto-generated method stub
		lista.remove(idUsuario);
	}

}
