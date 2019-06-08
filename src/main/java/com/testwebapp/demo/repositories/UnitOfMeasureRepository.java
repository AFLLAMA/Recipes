package com.testwebapp.demo.repositories;

import com.testwebapp.demo.domain.Category;
import com.testwebapp.demo.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByUom(String uom);

}
