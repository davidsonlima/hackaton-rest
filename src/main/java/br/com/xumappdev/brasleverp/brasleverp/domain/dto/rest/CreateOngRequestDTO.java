package br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateOngRequestDTO {

    @NotNull
    @NotEmpty
    @JsonProperty(value = "email")
    private String email;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "name")
    private String name;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "docs")
    private byte[] docs;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "name")
    private String ownerName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getDocs() {
        return docs;
    }

    public void setDocs(byte[] docs) {
        this.docs = docs;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
