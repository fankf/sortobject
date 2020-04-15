package com.fankf;

import com.fankf.arithmetic.Arithmetic;
import com.fankf.arithmetic.Bubble;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;
import com.fankf.enums.ArithmeticEnum;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static List<Object> sort(SortObjectList objectList) {
        ArithmeticEnum method = objectList.getMethod();

        Arithmetic arithmetic;
        switch (method) {
            case BubbleSort:
                arithmetic = new Bubble();
            default:
                arithmetic = new Bubble();
        }

        List<Object> result = new ArrayList<>();

        arithmetic.sort(objectList.getObjects(), objectList.isAsc());

        for (SortObject sortObject : objectList.getObjects()) {
            result.add(sortObject.getSortObject());
        }
        return result;
    }
}
