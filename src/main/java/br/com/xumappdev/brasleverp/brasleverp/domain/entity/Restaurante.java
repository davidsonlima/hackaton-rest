package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "t_restaurante")
public class Restaurante {

    @Id
    private Long id;

    @Column(name = "tx_nome_restaurante")
    private String nomeRestaurante;

    @Column(name = "tx_cnpj")
    private Long cnpj;

    @Column(name = "tx_email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }


}
