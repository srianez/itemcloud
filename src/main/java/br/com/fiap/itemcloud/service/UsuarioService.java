package br.com.fiap.itemcloud.service;

import br.com.fiap.itemcloud.model.Usuario;
import br.com.fiap.itemcloud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario) {
        Usuario usuarios = usuarioRepository.findByUsuario(usuario.getUsuario());
        usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(String user) {
        Usuario usuario = usuarioRepository.findOne(user);
        return usuario;
    }

}
