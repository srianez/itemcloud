package br.com.fiap.itemcloud.repository;

import br.com.fiap.itemcloud.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByUsuario(String usuario);

}
