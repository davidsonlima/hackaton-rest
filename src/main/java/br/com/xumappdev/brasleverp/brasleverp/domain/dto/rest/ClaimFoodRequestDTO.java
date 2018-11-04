package br.com.xumappdev.brasleverp.brasleverp.domain.dto.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ClaimFoodRequestDTO {

    @NotNull
    @NotEmpty
    @JsonProperty(value = "ongId")
    private Long ongId;

    @NotNull
    @NotEmpty
    @JsonProperty(value = "foodId")
    private Long foodId;

    public Long getOngId() {
        return ongId;
    }

    public void setOngId(Long ongId) {
        this.ongId = ongId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
}
