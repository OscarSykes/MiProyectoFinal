package org.oscar.hdz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.oscar.hdz.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
