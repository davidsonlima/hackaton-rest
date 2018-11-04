package br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CreateFoodRequestDTO {

    @NotNull
    @NotEmpty
    @JsonProperty(value = "restaurantId")
    private Long restaurantId;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "description")
    private String description;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "startDate")
    private Date startDate;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "endDate")
    private Date endDate;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "quantity")
    private Double quantity;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "foodTypeId")
    private Long foodTypeId;

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Long getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Long foodTypeId) {
        this.foodTypeId = foodTypeId;
    }
}
