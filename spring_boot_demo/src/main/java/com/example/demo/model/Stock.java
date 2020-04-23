package com.example.demo.model;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "stocks")
public class Stock {

    @Id
    private String id;

    @NotBlank
    @Indexed(direction = IndexDirection.ASCENDING)
    private String name;

    public Stock(@BsonProperty("id") String id, @BsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
