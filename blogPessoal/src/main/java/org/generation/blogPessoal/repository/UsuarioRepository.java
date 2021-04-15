package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


public interface UsuarioRepository extends JpaRepositoryImplementation<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);

}
