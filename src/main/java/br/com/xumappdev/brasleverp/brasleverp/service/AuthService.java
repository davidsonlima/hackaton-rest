package br.com.xumappdev.brasleverp.brasleverp.service;

import br.com.xumappdev.brasleverp.brasleverp.dto.rest.LoginResponseDTO;

public interface AuthService {
    LoginResponseDTO login(String username, String password) throws Exception;
}
