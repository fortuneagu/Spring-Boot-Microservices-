package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
    //The second parameter in the angle brackets is the type of the Tour id

}
