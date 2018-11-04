package br.com.xumappdev.brasleverp.brasleverp.repository;

import br.com.xumappdev.brasleverp.brasleverp.domain.entity.Ong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OngRepository extends JpaRepository<Ong, Long> {
    Optional<Ong> findByEmail(String email);
}
