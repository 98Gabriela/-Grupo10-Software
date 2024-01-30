package com.gestion.cuentas.repositorio;

import com.gestion.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
}
