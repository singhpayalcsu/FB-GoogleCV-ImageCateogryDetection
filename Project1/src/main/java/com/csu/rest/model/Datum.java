package com.csu.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "photos",
    "name",
    "id"
})
public class Datum {

    @JsonProperty("photos")
    private Photos photos;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    @JsonProperty("photos")
    public Photos getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}