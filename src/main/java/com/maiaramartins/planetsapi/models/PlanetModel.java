package com.maiaramartins.planetsapi.models;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;


@Document(collection = "planets")
@Getter
@Setter
public class PlanetModel {

    @Id
    private long id;
    private String name;
    private String climate;
    private String terrain;

    public PlanetModel() {
    }

    public PlanetModel(String name, String climate, String terrain) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
    }

    @Override
    public String toString() {
        return "PlanetModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", climate='" + climate + '\'' +
                ", terrain='" + terrain + '\'' +
                '}';
    }
}
