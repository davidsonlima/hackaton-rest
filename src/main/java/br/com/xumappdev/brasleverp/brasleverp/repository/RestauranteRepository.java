package br.com.xumappdev.brasleverp.brasleverp.repository;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    Optional<Restaurante> findByEmail(String email);
}
