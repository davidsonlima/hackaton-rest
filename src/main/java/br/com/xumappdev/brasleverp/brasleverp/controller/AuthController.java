package br.com.xumappdev.brasleverp.brasleverp.controller;

import br.com.xumappdev.brasleverp.brasleverp.dto.rest.LoginRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.dto.rest.LoginResponseDTO;
import br.com.xumappdev.brasleverp.brasleverp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(path = "/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public LoginResponseDTO login(@Valid @RequestBody LoginRequestDTO request) throws Exception {
        LoginResponseDTO responseDTO = authService.login(request.getEmail(), request.getPassword());
        return responseDTO;
    }
}
