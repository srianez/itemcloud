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

    public void salvar(Item item) {
        Item itens = itemRepository.findByNome(item.getNome());
        if (itens != null) {
            item.setId(itens.getId());
        }
        itemRepository.save(item);
    }

    public List<Item> buscarTodas(){
        return itemRepository.findAll();
    }

    public Item buscarItem(String nome) {
        Item itens = itemRepository.findByNome(nome);

        if (itens == null) {
            return new Item();
        } else {
            return itemRepository.findByNome(nome);
        }
    }

}
