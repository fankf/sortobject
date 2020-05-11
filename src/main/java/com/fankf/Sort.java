package com.fankf;

import com.fankf.arithmetic.Algorithm;
import com.fankf.arithmetic.Bubble;
import com.fankf.arithmetic.Selection;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;
import com.fankf.enums.AlgorithmEnum;
import com.fankf.enums.CompareEnum;
import com.fankf.utils.AlgorithmSelectUtils;
import com.fankf.utils.ReflectUtils;
import com.fankf.utils.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

    private static final boolean asc = Boolean.TRUE;
    private static final CompareEnum compare = CompareEnum.NUM;


    //reflect all
    public static <T> List<T> sort(List<T> objects, String filed, AlgorithmEnum method, boolean asc, CompareEnum compare) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        if (objects == null || objects.size() == 0) {
            return null;
        } else if (objects.size() == 1) {
            return Arrays.asList((T) objects.get(0));
        }
        boolean contain = false;
        for (T object : objects) {
            contain = ReflectUtils.containFiled(object.getClass(), filed);
            break;
        }
        if (!contain) {
            return null;
        }
        //组装 必须是POJO 例如 age 此处getAge
        String filedGetMethed = StringUtils.getFiledGetMethed(filed);
        List<SortObject> objects1 = new ArrayList<>();
        for (T object : objects) {
            String value = (String) object.getClass().getMethod(filedGetMethed).invoke(object);
            SortObject sortObject = new SortObject(value,object);
            objects1.add(sortObject);
        }
        return sort(objects1, method, asc, compare);
    }


    public static <T> List<T> sort(List<T> objects, String filed, AlgorithmEnum method) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return sort(objects, filed, method, asc, CompareEnum.NUM);
    }

    public static <T> List<T> sort(List<T> objects, String filed, AlgorithmEnum method, boolean asc) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return sort(objects, filed, method, asc, CompareEnum.NUM);
    }

    public static <T> List<T> sort(List<T> objects, String filed, AlgorithmEnum method, CompareEnum compare) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return sort(objects, filed, method, asc, compare);
    }

    //all
    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, boolean asc, CompareEnum compare) {
        if (objects == null || objects.size() == 0) {
            return null;
        } else if (objects.size() == 1) {
            return Arrays.asList((T) objects.get(0).getSortObject());
        }

        if (compare == null) {
            compare = CompareEnum.NUM;
        }

        Algorithm arithmetic = AlgorithmSelectUtils.getAlgorith(objects);
        switch (method) {
            case BubbleSort:
                arithmetic = new Bubble();
                break;
            case SelectionSort:
                arithmetic = new Selection();
                break;
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

    public static <T> List<T> sort(SortObjectList objectList) {
        return sort(objectList.getObjects(), objectList.getMethod(), objectList.isAsc(), objectList.getCompare());
    }

    public static <T> List<T> sort(List<SortObject> objects) {
        return sort(objects, null, asc, compare);
    }

    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method) {
        return sort(objects, method, asc, compare);
    }

    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, boolean asc) {
        return sort(objects, method, asc, compare);
    }

    public static <T> List<T> sort(List<SortObject> objects, AlgorithmEnum method, CompareEnum compare) {
        return sort(objects, method, asc, compare);
    }


}
