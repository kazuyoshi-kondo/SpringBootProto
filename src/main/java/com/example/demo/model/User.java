package com.example.demo.model;

import lombok.Data;

@Data
public class User {

    private Integer authId;

    private Integer id;

    private String name;

    private Integer rank;

    public User(Integer id, String name, Integer rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    // public Integer getAuthId() {
    //     return authId;
    // }

    // public void setAuthId(Integer authId) {
    //     this.authId = authId;
    // }

    // public Integer getId() {
    //     return id;
    // }

    // public void setId(Integer id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public Integer getRank() {
    //     return rank;
    // }

    // public void setRank(Integer rank) {
    //     this.rank = rank;
    // }
}
