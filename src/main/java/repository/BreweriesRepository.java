package repository;

import model.Breweries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreweriesRepository  extends JpaRepository<Breweries, Integer> {
}
