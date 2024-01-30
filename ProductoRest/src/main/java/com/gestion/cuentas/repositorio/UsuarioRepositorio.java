package com.gestion.cuentas.repositorio;

import com.gestion.cuentas.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
