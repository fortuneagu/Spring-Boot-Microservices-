package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    //The second parameter in the angle brackets is the type of the TourPackage id
}
