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
    public Item buscarItemNome(@PathVariable(value = "nome") String nome){
        return itemService.buscarItemNome(nome);
    }

    @GetMapping("/id/{id}")
    public Item buscarItemId(@PathVariable(value = "id") int id){
        return itemService.buscarItemId(id);
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

    @DeleteMapping("/id/{id}")
    private void deleteById(@PathVariable(value = "id") String id) {
        itemService.deleteById(id);
    }

}
