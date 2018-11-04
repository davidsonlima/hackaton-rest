package br.com.xumappdev.brasleverp.brasleverp.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO for login api response.
 */

public class LoginResponseDTO {

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "token")
    private String token;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
