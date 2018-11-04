package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_alimentos")
public class ListaAlimentos {

    @Id
    private Long id;

    @Column(name = "tx_nome_alimento")
    private String nomeAlimento;

    //TODO: criar fk para id_lista, id_rest, id_ong

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }
}
