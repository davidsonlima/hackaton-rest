package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "t_endereco")
public class Endereco {

    @Id
    private Long id;

    @Column(name = "tx_rua")
    private String nomeRua;

    @Column(name = "int_numero")
    private Integer numeroRua;

    @Column(name = "tx_bairro")
    private String nomeBairro;

    @Column(name = "tx_cidade")
    private String nomeCidade;

    @Column(name = "tx_estado")
    private String nomeEstado;

    //TODO: criar pk para id_rest, id_ong

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Integer getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(Integer numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeRua;
    }
}
