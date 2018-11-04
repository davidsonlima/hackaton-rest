package br.com.xumappdev.brasleverp.brasleverp.service.impl;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Food;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import br.com.xumappdev.brasleverp.brasleverp.repository.FoodRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.FoodTypeRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.OngRepository;
import br.com.xumappdev.brasleverp.brasleverp.repository.RestaurantRepository;
import br.com.xumappdev.brasleverp.brasleverp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private FoodTypeRepository foodTypeRepository;

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public void createFood(long restaurantId, String description, Date startDate,
                           Date endDate, double quantity, long foodTypeId) {
        Food food = new Food();
        food.setRestaurant(restaurantRepository.getOne(restaurantId));
        food.setFoodType(foodTypeRepository.getOne(foodTypeId));
        food.setQuantity(quantity);
        food.setStartDate(startDate);
        food.setEndDate(endDate);
        foodRepository.save(food);
    }

    @Override
    public void claimFood(long ongId, long foodId) {
        Food food = foodRepository.getOne(foodId);
        Ong ong = ongRepository.getOne(foodId);
        food.setOng(ong);
        food.setClaimDate(new Date());
    }

    @Override
    public List<Food> listAll() {
        return foodRepository.findAll();
    }
}
