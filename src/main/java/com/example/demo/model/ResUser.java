package com.example.demo.model;

import lombok.Data;

@Data
public class ResUser {

    private User user;

    private Boolean result;

    private Integer errCode;
    
    private String errMessage;

/*
    public User getUser() {
        return employee;
    }

    public void setUser(User e) {
        this.employee = e;
    }

    public Boolean getResut() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
*/
}
