package br.com.xumappdev.brasleverp.brasleverp.controller;

import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.ClaimFoodRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest.CreateFoodRequestDTO;
import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Food;
import br.com.xumappdev.brasleverp.brasleverp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(path = "/food/create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void createFood(@Valid @RequestBody CreateFoodRequestDTO request) throws Exception {

        this.foodService.createFood(request.getRestaurantId(), request.getDescription(),
                request.getStartDate(), request.getEndDate(), request.getQuantity(),
                request.getFoodTypeId());
    }

    @RequestMapping(path = "/food/claim", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void createFood(@Valid @RequestBody ClaimFoodRequestDTO request) throws Exception {

        this.foodService.claimFood(1l,2l);
    }

    @RequestMapping(path = "/food/list", method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Food> getAllFoods() {
        return this.foodService.listAll();
    }
}

