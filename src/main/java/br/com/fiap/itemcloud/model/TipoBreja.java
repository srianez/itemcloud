package br.com.fiap.itemcloud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TipoBreja {

    @Id
    private String tipo;
    private String descricao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoBreja() {

    }

    public TipoBreja(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

}
