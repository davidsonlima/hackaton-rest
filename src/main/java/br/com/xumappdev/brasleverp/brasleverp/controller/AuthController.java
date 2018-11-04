package br.com.xumappdev.brasleverp.brasleverp.controller;

import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.CreateOngRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.CreateRestaurantRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.LoginRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.LoginResponseDTO;
import br.com.xumappdev.brasleverp.brasleverp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(path = "/auth/login", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody LoginResponseDTO login(@Valid @RequestBody LoginRequestDTO request) throws Exception {
        LoginResponseDTO responseDTO = authService.login(request.getEmail(), request.getPassword());
        return responseDTO;
    }

    @RequestMapping(path = "/auth/createOng", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void createOng(@Valid @RequestBody CreateOngRequestDTO request) throws Exception {
        authService.createOng(request.getEmail(), request.getPassword(), request.getDocs(),
                request.getName(), request.getOwnerName());
    }

    @RequestMapping(path = "/auth/createRestaurant", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void createRestaurant(@Valid @RequestBody CreateRestaurantRequestDTO request) throws Exception {
        authService.createRestaurant(request.getEmail(), request.getPassword(), request.getName(), request.getCnpj(), request.getAddress());
    }
}
