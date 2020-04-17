package com.fankf.arithmetic;

import com.fankf.bean.SortObject;
import com.fankf.enums.CompareEnum;

public abstract class Algorithm {

    public abstract void sort(SortObject[] objects, boolean asc);

    public abstract void sort(SortObject[] objects, boolean asc, CompareEnum compareEnum);

    protected void swap(SortObject s1, SortObject s2) {
        SortObject so = s1;
        s1 = s2;
        s2 = so;
    }
}
