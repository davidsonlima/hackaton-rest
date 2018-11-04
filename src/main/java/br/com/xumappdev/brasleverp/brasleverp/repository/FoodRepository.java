package br.com.xumappdev.brasleverp.brasleverp.repository;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
