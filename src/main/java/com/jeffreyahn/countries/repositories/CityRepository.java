package com.jeffreyahn.countries.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffreyahn.countries.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

}
