package br.com.fiap.itemcloud.service;

import br.com.fiap.itemcloud.model.Breja;
import br.com.fiap.itemcloud.repository.BrejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BrejaService {

    @Autowired
    BrejaRepository brejaRepository;

    //salva a breja
    public void salvar(Breja breja) {
        Breja brejas = brejaRepository.findByNome(breja.getNome());
        if (brejas != null) {
            breja.setId(brejas.getId());
        }

        brejaRepository.save(breja);
    }

    public void atualizar(@RequestBody Breja breja) {
        brejaRepository.save(breja);
    }

    public List<Breja> buscarTodas(){
        return brejaRepository.findAll();
    }

    //busca por nome
    public Breja buscarBrejaNome(String nome) {
        Breja brejas = brejaRepository.findByNome(nome);

        if (brejas == null) {
            return new Breja();
        } else {
            return brejaRepository.findByNome(nome);
        }
    }

    //busca por conteúdo
    public Breja findByNomeContaining(String nome) {
        Breja brejas = brejaRepository.findByNomeContaining(nome);
        if (brejas == null) {
            return new Breja();
        } else {
            return brejas;
        }
    }

    //busca por id
    public Breja buscarBrejaId(String idBreja) {
        Breja breja = brejaRepository.findById(idBreja);
        return breja;
    }

    //apaga todos
    public void deleteAll() {
        brejaRepository.deleteAll();
    }

    //apaga por id
    public void deleteById(String idBreja) {
        Breja breja = buscarBrejaId(idBreja);

        if (breja != null) {
            brejaRepository.delete(breja);
        }

    }

}
