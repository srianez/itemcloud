package br.com.fiap.itemcloud.service;

import br.com.fiap.itemcloud.model.Breja;
import br.com.fiap.itemcloud.model.TipoBreja;
import br.com.fiap.itemcloud.repository.BrejaRepository;
import br.com.fiap.itemcloud.repository.TipoBrejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TipoBrejaService {

    @Autowired
    TipoBrejaRepository tipoBrejaRepository;

    //salva o tipo
    public void salvar(TipoBreja tipoBreja) {
        tipoBrejaRepository.save(tipoBreja);
    }

    public List<TipoBreja> buscarTodas(){
        return tipoBrejaRepository.findAll();
    }

    //apaga todos
    public void deleteAll() {
        tipoBrejaRepository.deleteAll();
    }

    //apaga por id
    public void deleteById(String idBreja) {
        TipoBreja tipoBreja = tipoBrejaRepository.findOne(idBreja);

        if (tipoBreja != null) {
            tipoBrejaRepository.delete(tipoBreja);
        }

    }

}
