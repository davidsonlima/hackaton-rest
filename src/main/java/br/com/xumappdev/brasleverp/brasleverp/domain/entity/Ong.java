package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "t_ong")
public class Ong {

    @Id
    private Long id;

    @Column(name = "tx_nome_ong")
    private String nomeOng;

    @Column(name = "tx_nome_responsavel")
    private String nomeResponsavel;

    @Column(name = "tx_email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}