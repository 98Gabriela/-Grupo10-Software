package com.gestion.cuentas.servicio;

import com.gestion.cuentas.modelo.Cuenta;
import com.gestion.cuentas.controlador.CuentaControlador;
import com.gestion.cuentas.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServicio {
   @Autowired
   private CuentaRepositorio repositorio;
   public List<Cuenta> listarCuentas(){
       return repositorio.findAll();
   }
    public void guardarCuenta(Cuenta cuenta) {
        repositorio.save(cuenta);
    }

   public Cuenta obtenerCuenta(Integer id){
       return repositorio.findById(id).get();
   }

   public void eliminar(Integer id){
       repositorio.deleteById(id);
   }
}

