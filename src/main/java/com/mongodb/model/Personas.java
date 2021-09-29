package com.mongodb.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Getter
@Setter
@ToString
public class Personas {

    @Id
    private String id;

    @Field
    private String nombre;

    @Builder
    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public Personas() {
    }
}
