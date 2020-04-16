package com.fankf;

import com.fankf.enums.SortErrorEnum;

public class SortException extends Exception {

    private SortErrorEnum sortErrorEnum;

    public SortException(String message){
        super(message);
    }

    public SortException(SortErrorEnum sortErrorEnum) {
        this.sortErrorEnum = sortErrorEnum;
    }

    public SortErrorEnum getSortErrorEnum() {
        return sortErrorEnum;
    }

    public void setSortErrorEnum(SortErrorEnum sortErrorEnum) {
        this.sortErrorEnum = sortErrorEnum;
    }
}
