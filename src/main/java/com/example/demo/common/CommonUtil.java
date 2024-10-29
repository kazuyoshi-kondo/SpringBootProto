package com.example.demo.common;

public class CommonUtil {

    public static Boolean userAuthentication(Integer authId) {
        if (authId == null || authId < 10) {
            return false;
        }

        return true;
    }
}
