package com.fankf.bean;

public class SortObject<T> {

    private String sortFiled;
    private T sortObject;

    public SortObject() {
    }

    public SortObject(String sortFiled, T sortObject) {
        this.sortObject = sortObject;
        this.sortFiled = sortFiled;
    }

    public String getSortFiled() {
        return sortFiled;
    }

    public void setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
    }

    public T getSortObject() {
        return sortObject;
    }

    public void setSortObject(T sortObject) {
        this.sortObject = sortObject;
    }
}