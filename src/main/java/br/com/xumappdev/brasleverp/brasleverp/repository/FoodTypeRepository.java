package br.com.xumappdev.brasleverp.brasleverp.repository;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTypeRepository extends JpaRepository<FoodType, Long> {

}
