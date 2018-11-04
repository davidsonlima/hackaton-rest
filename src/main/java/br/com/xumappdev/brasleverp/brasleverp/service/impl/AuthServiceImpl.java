package br.com.xumappdev.brasleverp.brasleverp.service.impl;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Restaurante;
import br.com.xumappdev.brasleverp.brasleverp.dto.rest.LoginResponseDTO;
import br.com.xumappdev.brasleverp.brasleverp.repository.OngRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.RestauranteRepository;
import br.com.xumappdev.brasleverp.brasleverp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AuthServiceImpl implements AuthService {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Override
    public LoginResponseDTO login(String email, String password) throws Exception {
        Optional<Ong> ong = ongRepository.findByEmail(email);
        if(ong.isPresent()) {
            LoginResponseDTO responseDTO = new LoginResponseDTO();
            responseDTO.setName(ong.get().getNomeOng());
            responseDTO.setEmail(ong.get().getEmail());
            return responseDTO;
        }

        Optional<Restaurante> restaurante = restauranteRepository.findByEmail(email);
        if(ong.isPresent()) {
            LoginResponseDTO responseDTO = new LoginResponseDTO();
            responseDTO.setName(restaurante.get().getNomeRestaurante());
            responseDTO.setEmail(restaurante.get().getEmail());
            return responseDTO;
        }

        throw new Exception();
    }
}
