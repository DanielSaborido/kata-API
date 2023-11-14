package repository;

import model.Beers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beers, Integer> {
}
