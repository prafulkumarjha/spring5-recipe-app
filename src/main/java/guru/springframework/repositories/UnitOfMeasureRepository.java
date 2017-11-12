package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * created by Praful Jha on 12/11/2017
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
