package com.fankf;

import com.fankf.arithmetic.Algorithm;
import com.fankf.arithmetic.Bubble;
import com.fankf.arithmetic.Selection;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;
import com.fankf.enums.AlgorithmEnum;
import com.fankf.enums.CompareEnum;
import com.fankf.utils.AlgorithmSelectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

    private static final boolean asc = Boolean.TRUE;
    private static final CompareEnum compare = CompareEnum.NUM;

    //all
    public static <T> List<T> sort(List<SortObject> objects, boolean asc, AlgorithmEnum method, CompareEnum compare, Class<T> clazz) {
        if (objects == null) {
            return null;
        } else if (objects.size() == 0) {
            return null;
        } else if (objects.size() == 1) {
            return Arrays.asList((T) objects.get(0).getSortObject());
        }

        if (compare == null) {
            compare = CompareEnum.NUM;
        }

        Algorithm arithmetic;
        if (method == null) {
            arithmetic = AlgorithmSelectUtils.getAlgorith(objects);
        } else {
            switch (method) {
                case BubbleSort:
                    arithmetic = new Bubble();
                    break;
                case SelectionSort:
                    arithmetic = new Selection();
                    break;
                default:
                    arithmetic = AlgorithmSelectUtils.getAlgorith(objects);
            }
        }
        //转换
        SortObject[] sos = new SortObject[objects.size()];
        for (int i = 0; i < objects.size(); i++) {
            sos[i] = objects.get(i);
        }


        arithmetic.sort(sos, asc, compare);

        //返回
        List<T> result = new ArrayList<>();
        for (SortObject sortObject : sos) {
            result.add((T) sortObject.getSortObject());
        }
        return result;
    }

    //2
    public static <T> List<T> sort(SortObjectList objectList, Class<T> clazz) {
        return sort(objectList.getObjects(), objectList.isAsc(), objectList.getMethod(), objectList.getCompare(), clazz);
    }

    public static <T> List<T> sort(List<SortObject> objects, Class<T> clazz) {
        return sort(objects, asc, null, compare, clazz);
    }

    //3
    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, Class<T> clazz) {
        return sort(objects, asc, method, compare, clazz);
    }

    public static <T> List<T> sort(List<SortObject> objects, boolean asc, Class<T> clazz) {
        return sort(objects, asc, null, compare, clazz);
    }

    public static <T> List<T> sort(List<SortObject> objects, CompareEnum compare, Class<T> clazz) {
        return sort(objects, asc, null, compare, clazz);
    }

    //4
    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, CompareEnum compare, Class<T> clazz) {
        return sort(objects, asc, method, compare, clazz);
    }

    public static <T> List<T> sort(List<SortObject> objects, boolean asc, CompareEnum compare, Class<T> clazz) {
        return sort(objects, asc, null, compare, clazz);
    }

    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, boolean asc, Class<T> clazz) {
        return sort(objects, asc, method, compare, clazz);
    }

}
