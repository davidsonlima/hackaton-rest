package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_alimento")
public class Alimento {

    @Id
    private Long id;

    @Column(name = "tx_tipo_alimento")
    private String tipoAlimento;

    @Column(name = "tx_descricao", length = 3000)
    private String descricao;

    @Column(name = "dt_publicacao")
    private Date dataPublicacao;

    @Column(name = "dt_limite_retirada")
    private Date dataLimiteRetirada;

    @Column(name = "nu_qtd_alimento")
    private Double quantidadeAlimento;

    //TODO: criar pk para id_lista, id_rest, id_ong

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Date getDataLimiteRetirada() {
        return dataLimiteRetirada;
    }

    public void setDataLimiteRetirada(Date dataLimiteRetirada) {
        this.dataLimiteRetirada = dataLimiteRetirada;
    }

    public Double getQuantidadeAlimento() {
        return quantidadeAlimento;
    }

    public void setQuantidadeAlimento(Double quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }
}
