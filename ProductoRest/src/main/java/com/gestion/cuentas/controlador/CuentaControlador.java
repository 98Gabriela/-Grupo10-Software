package com.gestion.cuentas.controlador;


import com.gestion.cuentas.modelo.Cuenta;
import com.gestion.cuentas.modelo.Usuario;
import com.gestion.cuentas.repositorio.CuentaRepositorio;
import com.gestion.cuentas.repositorio.UsuarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaControlador {
    @Autowired
    private CuentaRepositorio cuentaRepositorio;
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    /*
    @GetMapping
    public ResponseEntity<Page<Cuenta>> listarCuentas(Pageable pageable){
      //  return ResponseEntity.ok(cuentaRepositorio.findAll(Pageable pageable));
    }*/
    @GetMapping
    public List<Cuenta> listarCuentas(){
        return cuentaRepositorio.findAll();
    }

    @PostMapping
    public ResponseEntity<Cuenta> guardarCuenta(@Valid @RequestBody Cuenta cuenta){
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(cuenta.getUsuario().getId());
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        cuenta.setUsuario(usuarioOptional.get());
        Cuenta cuentaGuardado = cuentaRepositorio.save(cuenta);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(cuentaGuardado.getId()).toUri();
        return ResponseEntity.created(ubicacion).body(cuentaGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cuenta> actualizarCuenta(@Valid @RequestBody Cuenta cuenta,@PathVariable Integer id)  {
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(cuenta.getUsuario().getId());
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Optional<Cuenta> cuentaOptional=cuentaRepositorio.findById(id);
        if (!cuentaOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        cuenta.setUsuario(usuarioOptional.get());
        cuenta.setId(cuentaOptional.get().getId());
        cuentaRepositorio.save(cuenta);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Cuenta> eliminarCuenta(@PathVariable Integer id){
        Optional<Cuenta> cuentaOptional=cuentaRepositorio.findById(id);
        if (!cuentaOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        cuentaRepositorio.delete(cuentaOptional.get());
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cuenta> obtenerCuentaPorID(@PathVariable Integer id){
        Optional<Cuenta> cuentaOptional=cuentaRepositorio.findById(id);
        if (!cuentaOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(cuentaOptional.get());
    }
}
