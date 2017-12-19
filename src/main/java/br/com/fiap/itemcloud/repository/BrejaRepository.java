package br.com.fiap.itemcloud.repository;

import br.com.fiap.itemcloud.model.Breja;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BrejaRepository extends MongoRepository<Breja, String>{

    Breja findByNome(String nome);

    Breja findById(String id);

    Breja findByNomeContaining(String nome);

}
