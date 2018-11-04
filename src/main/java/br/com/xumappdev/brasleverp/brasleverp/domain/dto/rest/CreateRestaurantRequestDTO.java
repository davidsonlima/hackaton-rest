package br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateRestaurantRequestDTO {

    @NotNull
    @NotEmpty
    @JsonProperty(value = "email")
    private String email;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "address")
    private String address;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "password")
    private String password;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "cnpj")
    private Long cnpj;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "name")
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
