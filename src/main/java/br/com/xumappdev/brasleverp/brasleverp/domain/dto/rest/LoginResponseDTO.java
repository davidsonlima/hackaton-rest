package br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest;

import br.com.xumappdev.brasleverp.brasleverp.domain.enumeration.UserType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO for login api response.
 */

public class LoginResponseDTO {

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "token")
    private String cnpj;

    @JsonProperty(value = "userType")
    private UserType userType;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
