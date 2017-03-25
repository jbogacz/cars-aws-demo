package com.example;

import org.springframework.data.annotation.Id;

/**
 * Created by jbogacz on 10.03.2017.
 */
public class Car {

    @Id
    private String id;

    private String company;
    private String model;
    private Integer year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
