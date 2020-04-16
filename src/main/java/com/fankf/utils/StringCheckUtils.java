package com.fankf.utils;

public class StringCheckUtils {

    public static boolean isBlank(String string){
        if(string != null && string.trim().length() > 0){
            return true;
        }
        return false;
    }
}
