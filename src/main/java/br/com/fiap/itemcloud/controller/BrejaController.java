package br.com.fiap.itemcloud.controller;

import br.com.fiap.itemcloud.model.Breja;
import br.com.fiap.itemcloud.service.BrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/breja")
public class BrejaController {

    @Autowired
    BrejaService brejaService;

    @GetMapping("/nome/{nome}")
    public Breja buscarBrejaNome(@PathVariable(value = "nome") String nome){
        return brejaService.buscarBrejaNome(nome);
    }

    @GetMapping("/nomeParcial/{nome}")
    public Breja findByNomeContaining(@PathVariable(value = "nome") String nome){
        return brejaService.findByNomeContaining(nome);
    }

    @GetMapping("/id/{id}")
    public Breja buscarItemId(@PathVariable(value = "id") String id)
    {
        return brejaService.buscarBrejaId(id);
    }

    @GetMapping()
    public List<Breja> buscarTodos(){
        return brejaService.buscarTodas();
    }

    @PostMapping
    public void salvar(@RequestBody Breja item) {
        brejaService.salvar(item);
    }

    @PutMapping
    public void atualizar(@RequestBody Breja item) {
        brejaService.atualizar(item);
    }

    @DeleteMapping
    private void deleteAll() {
        brejaService.deleteAll();
    }

    @DeleteMapping("/id/{id}")
    private void deleteById(@PathVariable(value = "id") String id) {
        brejaService.deleteById(id);
    }

}
