package com.fankf.enums;

public enum SortErrorEnum {

    SORT_ERROR_001("0001","sort filed can be null");
    private String code;
    private String message;

    SortErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
