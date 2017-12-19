package br.com.fiap.itemcloud.controller;

import br.com.fiap.itemcloud.model.Breja;
import br.com.fiap.itemcloud.model.TipoBreja;
import br.com.fiap.itemcloud.service.BrejaService;
import br.com.fiap.itemcloud.service.TipoBrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/tipo")
public class TipoBrejaController {

    @Autowired
    TipoBrejaService tipoBrejaService;


    @GetMapping()
    public List<TipoBreja> buscarTodos(){
        return tipoBrejaService.buscarTodas();
    }

    @PostMapping
    public void salvar(@RequestBody TipoBreja item) {
        tipoBrejaService.salvar(item);
    }

    @DeleteMapping
    private void deleteAll() {
        tipoBrejaService.deleteAll();
    }

    @DeleteMapping("/id/{id}")
    private void deleteById(@PathVariable(value = "id") String id) {
        tipoBrejaService.deleteById(id);
    }

}
