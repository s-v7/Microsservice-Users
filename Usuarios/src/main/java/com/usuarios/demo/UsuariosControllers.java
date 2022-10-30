package com.usuarios.demo;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Silas
 */
@RestController
public class UsuariosControllers {

    private final UsuariosRepository repository;

    public UsuariosControllers(UsuariosRepository repository) {
        this.repository = repository;
    }
    //Buscar n Objetos
    @GetMapping("/usuarios")
    List<Usuarios> all() {
        return repository.findAll();
    }
    //Criar Objetos
    @PostMapping("/usuarios")
    Usuarios newUsuario(@RequestBody Usuarios newUsuario) {
        return repository.save(newUsuario);
    }
    //Buscar um Obejtos
    @GetMapping("/usuarios/{id}")
    Usuarios one(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new UsuarioNotFoundException(id));
    }
    //Atualizar um Objeto
    @PutMapping("/usuarios/{id}")
    Usuarios replaceUsuario(@RequestBody Usuarios newUsuario, @PathVariable Integer id) {
        return repository.findById(id)
                .map(usuario -> {
                    usuario.setNome(newUsuario.getNome());
                    usuario.setIdade(newUsuario.getIdade());
                    usuario.setEndereco(newUsuario.getEndereco());
                    usuario.setEstado(newUsuario.getEstado());
                    usuario.setPais(newUsuario.getPais());
                    return repository.save(usuario);
                })
                .orElseGet(() -> {
                    newUsuario.setId(id);
                    return repository.save(newUsuario);
                });
    }
    //Deletar um Objeto
    @DeleteMapping("/usuarios/{id}")
    void deleteUsuario(@PathVariable Integer id){
        repository.deleteById(id);
    }
}
