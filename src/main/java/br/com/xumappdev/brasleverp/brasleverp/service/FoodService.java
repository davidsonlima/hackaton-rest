package br.com.xumappdev.brasleverp.brasleverp.service;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Food;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Restaurant;

import java.util.Date;
import java.util.List;

public interface FoodService {
    void createFood(long restaurantId, String description, Date startDate, Date endDate, double quantity, long foodTypeId);
    void claimFood(long ongId, long foodId);
    List<Food> listAll();
}
