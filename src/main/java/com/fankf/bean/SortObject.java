package com.fankf.bean;

public class SortObject {

    private String sortFiled;
    private Object sortObject;

    public SortObject() {
    }

    public SortObject(String sortFiled, Object sortObject) {
        this.sortObject = sortObject;
        this.sortFiled = sortFiled;
    }

    public String getSortFiled() {
        return sortFiled;
    }

    public void setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
    }

    public Object getSortObject() {
        return sortObject;
    }

    public void setSortObject(Object sortObject) {
        this.sortObject = sortObject;
    }
}