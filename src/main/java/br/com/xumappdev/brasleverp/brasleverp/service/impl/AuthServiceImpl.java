package br.com.xumappdev.brasleverp.brasleverp.service.impl;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Restaurant;
import br.com.xumappdev.brasleverp.brasleverp.domain.enumeration.UserType;
import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.LoginResponseDTO;
import br.com.xumappdev.brasleverp.brasleverp.repository.OngRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.RestaurantRepository;
import br.com.xumappdev.brasleverp.brasleverp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AuthServiceImpl implements AuthService {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public LoginResponseDTO login(String email, String password) throws Exception {
        Optional<Ong> ong = ongRepository.findByEmail(email);
        if(ong.isPresent()) {
            LoginResponseDTO responseDTO = new LoginResponseDTO();
            responseDTO.setName(ong.get().getName());
            responseDTO.setEmail(ong.get().getEmail());
            responseDTO.setUserType(UserType.ONG_USER);
            return responseDTO;
        }
        Optional<Restaurant> restaurante = restaurantRepository.findByEmail(email);
        if(restaurante.isPresent()) {
            LoginResponseDTO responseDTO = new LoginResponseDTO();
            responseDTO.setName(restaurante.get().getName());
            responseDTO.setEmail(restaurante.get().getEmail());
            responseDTO.setUserType(UserType.RESTAURANT_USER);
            return responseDTO;
        }
        throw new Exception();
    }

    @Override
    public void createOng(String email, String password, byte[] docs, String name, String ownerName) throws Exception {
        Ong ong = new Ong();
        ong.setEmail(email);
        ong.setPassword(password);
        ong.setName(name);
        ong.setOwnerName(ownerName);
        ongRepository.save(ong);
    }

    @Override
    public void createRestaurant(String email, String password, String name, long cnpj, String address) throws Exception {
        Restaurant restaurant = new Restaurant();
        restaurant.setEmail(email);
        restaurant.setPassword(password);
        restaurant.setName(name);
        restaurant.setCnpj(cnpj);
        restaurantRepository.save(restaurant);
    }
}
