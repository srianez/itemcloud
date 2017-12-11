package br.com.fiap.itemcloud.controller;

import br.com.fiap.itemcloud.model.Usuario;
import br.com.fiap.itemcloud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/buscausuario/{usuario}")
    public Usuario buscarUsuario(@PathVariable(value = "usuario") String usuario){
        return usuarioService.buscarUsuario(usuario);
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
    }

}
