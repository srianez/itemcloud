package br.com.fiap.itemcloud.repository;


import br.com.fiap.itemcloud.model.Breja;
import br.com.fiap.itemcloud.model.TipoBreja;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoBrejaRepository extends MongoRepository<TipoBreja, String>{

    TipoBreja findByNome(String nome);

}
