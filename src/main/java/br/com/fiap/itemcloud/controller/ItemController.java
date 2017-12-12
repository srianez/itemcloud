package br.com.fiap.itemcloud.controller;

import br.com.fiap.itemcloud.model.Item;
import br.com.fiap.itemcloud.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/nome/{nome}")
    public Item buscarItem(@PathVariable(value = "nome") String nome){

        return itemService.buscarItem(nome);
    }

    @GetMapping()
    public List<Item> buscarTodos(){

        return itemService.buscarTodas();
    }

    @PostMapping
    public void salvar(@RequestBody Item item) {

        itemService.salvar(item);
    }

    @DeleteMapping
    private void deleteAll() {
        itemService.deleteAll();
    }
    
}
