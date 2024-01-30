package com.gestion.cuentas.controlador;

import com.gestion.cuentas.modelo.Usuario;
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
@RequestMapping("/api/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @GetMapping
    /*public ResponseEntity<Page<Usuario>> listarUsuarios(Pageable pageable) {
        return ResponseEntity.ok(usuarioRepositorio.findAll(pageable));
    }*/
    public List<Usuario> listarUsuarios(){
        return usuarioRepositorio.findAll();
    }
    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@Valid @RequestBody Usuario usuario) {
        Usuario usuarioGuardada = usuarioRepositorio.save(usuario);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(usuarioGuardada.getId()).toUri();
        return ResponseEntity.created(ubicacion).body(usuarioGuardada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @Valid @RequestBody Usuario usuario) {
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(id);
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        usuario.setId(usuarioOptional.get().getId());
        usuarioRepositorio.save(usuario);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Integer id, @Valid @RequestBody Usuario usuario) {
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(id);
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        usuarioRepositorio.delete(usuarioOptional.get());
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Integer id) {
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(id);
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(usuarioOptional.get());
    }
}