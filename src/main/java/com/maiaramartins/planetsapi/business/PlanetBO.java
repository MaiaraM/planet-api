package com.maiaramartins.planetsapi.business;

import com.maiaramartins.planetsapi.models.PlanetModel;
import com.maiaramartins.planetsapi.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetBO {

    @Autowired
    PlanetRepository planetRepository;

    public List<PlanetModel> findAllPlanets() {
        return planetRepository.findAll();
    }

    public PlanetModel findByName(String name) {
        return planetRepository.findAllByName(name);
    }

    public PlanetModel findById(String id) {
        return planetRepository.findById(Long.parseLong(id));
    }

    public PlanetModel deleteById(long id) {
        return planetRepository.deleteById(id);
    }
}
