package repository;

import model.Styles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StyleRepository extends JpaRepository<Styles, Integer> {
}
