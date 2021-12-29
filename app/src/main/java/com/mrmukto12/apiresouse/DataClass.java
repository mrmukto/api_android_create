package com.mrmukto12.apiresouse;

public class DataClass {

    private String resource;
    private Integer id;
    private String name;
    private String updatedAt;

    public DataClass() {
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DataClass(String resource, Integer id, String name, String updatedAt) {
        this.resource = resource;
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
    }
}
