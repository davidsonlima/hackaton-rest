package br.com.xumappdev.brasleverp.brasleverp.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_alimento")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    private FoodType foodType;

    @Column(name = "dt_publicacao")
    private Date startDate;

    @Column(name = "dt_claim")
    private Date claimDate;

    @Column(name = "dt_limite_retirada")
    private Date endDate;

    @Column(name = "nu_qtd_alimento")
    private Double quantity;

    @ManyToOne
    private Restaurant restaurant;

    @OneToOne
    private Ong ong;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }

}
