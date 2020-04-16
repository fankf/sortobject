package com.fankf.bean;

import com.fankf.enums.ArithmeticEnum;

import java.util.Iterator;
import java.util.List;

public class SortObjectList {
    /*
     * 是否是顺序排列
     * true 顺序排列
     * false 逆序排列
     */
    private boolean asc;

    /*
     * 排序方法
     */
    private ArithmeticEnum method;

    /*
     * 排序对象组
     */
    private SortObject[] objects;

    private SortObjectList() {
    }

    private static SortObjectList sortObjects;

    public static SortObjectList init() {
        sortObjects = new SortObjectList();
        sortObjects.asc = false;
        sortObjects.method = ArithmeticEnum.BubbleSort;
        return sortObjects;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public ArithmeticEnum getMethod() {
        return method;
    }

    public void setMethod(ArithmeticEnum method) {
        this.method = method;
    }

    public SortObject[] getObjects() {
        return objects;
    }

    public void setObjects(SortObject[] objects) {
        this.objects = objects;
    }

    public void setObjects(List<SortObject> objects) {
        SortObject[] sortObjects = new SortObject[objects.size()];
        for (int i = 0; i < objects.size(); i++) {
            sortObjects[i] = objects.get(i);
        }
        this.objects = sortObjects;
    }
}
