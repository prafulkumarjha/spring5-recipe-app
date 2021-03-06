package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * created by Praful Jha on 12/11/2017
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}
