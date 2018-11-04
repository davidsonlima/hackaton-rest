package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_documentacao_ong")
public class OngDocs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "tx_registro_cartorio")
    private String registroCartorio;

    @Column(name = "tx_certificacao")
    private Date certificacao;

    //TODO: criar pk para id_ong

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistroCartorio() {
        return registroCartorio;
    }

    public void setRegistroCartorio(String registroCartorio) {
        this.registroCartorio = registroCartorio;
    }

    public Date getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(Date certificacao) {
        this.certificacao = certificacao;
    }
}
