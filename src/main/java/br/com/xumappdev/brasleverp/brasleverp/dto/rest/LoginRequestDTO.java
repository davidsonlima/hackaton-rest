package br.com.xumappdev.brasleverp.brasleverp.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * DTO for login api request.
 */

public class LoginRequestDTO {

    @NotNull
    @NotEmpty
    @JsonProperty(value = "username")
    private String username;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
