package br.com.fiap.itemcloud.service;

import br.com.fiap.itemcloud.model.Item;
import br.com.fiap.itemcloud.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    //salva o item
    public void salvar(Item item) {
        Item itens = itemRepository.findByNome(item.getNome());
        if (itens != null) {
            item.setId(itens.getId());
        }
        itemRepository.save(item);
    }

    //retorna todos os itens
    public List<Item> buscarTodas(){
        return itemRepository.findAll();
    }

    //busca por nome
    public Item buscarItemNome(String nome) {
        Item itens = itemRepository.findByNome(nome);

        if (itens == null) {
            return new Item();
        } else {
            return itemRepository.findByNome(nome);
        }
    }

    //busca por conteúdo
    public Item findByNomeContaining(String nome) {
        Item itens = itemRepository.findByNomeContaining(nome);
        if (itens == null) {
            return new Item();
        } else {
            return itens;
        }
    }


    //busca por id
    public Item buscarItemId(String idItem) {
        Item item = itemRepository.findById(idItem);

        return item;
    }

    //apaga todos
    public void deleteAll() {
        itemRepository.deleteAll();
    }

    //apaga por id
    public void deleteById(String idItem) {
        Item item = buscarItemId(idItem);

        if (item != null) {
            itemRepository.delete(item);
        }

    }

}
