package com.maiaramartins.planetsapi.models;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


@Document(collection = "planets")
@Getter
@Setter
public class PlanetModel {

    @Id
    private String id;

    @NotNull
    @Indexed(unique = true)
    private String name;

    @NotNull
    private String climate;

    @NotNull
    private String terrain;

    public PlanetModel() {
    }

    public PlanetModel(String name, String climate, String terrain) {
        id = new ObjectId().toString();
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
