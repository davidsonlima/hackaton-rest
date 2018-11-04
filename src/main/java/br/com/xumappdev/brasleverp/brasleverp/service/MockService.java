package br.com.xumappdev.brasleverp.brasleverp.service;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Restaurant;
import br.com.xumappdev.brasleverp.brasleverp.repository.OngRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
public class MockService {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostConstruct
    private void init() {
        mockUsers();
    }

    @Transactional
    public void mockUsers() {
        Ong ong = new Ong();
        ong.setEmail("ong@ong.com");
        ong.setName("Ong Foo");
        ong.setOwnerName("Ongio da Silva");

        Restaurant restaurant = new Restaurant();

        restaurant.setCnpj(1921599592592L);
        restaurant.setEmail("rest@rest.com");
        restaurant.setName("Restaurant Bar");

        this.ongRepository.save(ong);
        this.restaurantRepository.save(restaurant);
    }
}
