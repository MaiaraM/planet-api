package com.maiaramartins.planetsapi.repositories;

import com.maiaramartins.planetsapi.models.PlanetModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends MongoRepository<PlanetModel, String>{

    PlanetModel findAllByName(String name);
    PlanetModel findById(long id);
    PlanetModel deleteById(long id);

}
