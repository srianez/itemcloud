package br.com.fiap.itemcloud.repository;

import br.com.fiap.itemcloud.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemRepository  extends MongoRepository<Item, String>{

    Item findByNome(String nome);

}
