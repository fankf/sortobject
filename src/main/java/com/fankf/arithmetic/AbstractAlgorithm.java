package com.fankf.arithmetic;

import com.fankf.bean.SortObject;
import com.fankf.enums.CompareEnum;

public abstract class AbstractAlgorithm implements Algorithm {

    @Override
    public abstract void sort(SortObject[] objects, boolean asc, CompareEnum compareEnum);

    protected void sort(SortObject[] objects, boolean asc) {
        sort(objects, asc, CompareEnum.NUM);
    }

    protected void swap(SortObject[] sortObjects, int i, int j) {
        SortObject so = sortObjects[i];
        sortObjects[i] = sortObjects[j];
        sortObjects[j] = so;
    }
}
