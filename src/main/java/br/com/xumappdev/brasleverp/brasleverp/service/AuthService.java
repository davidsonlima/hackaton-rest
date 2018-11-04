package br.com.xumappdev.brasleverp.brasleverp.service;

import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.LoginResponseDTO;

public interface AuthService {
    LoginResponseDTO login(String email, String password) throws Exception;
    void createOng(String email, String password, byte[] docs, String name, String ownerName) throws Exception;
    void createRestaurant(String email, String password, String name, long cnpj, String address) throws Exception;
}
