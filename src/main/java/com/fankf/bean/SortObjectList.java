package com.fankf.bean;

import com.fankf.enums.AlgorithmEnum;
import com.fankf.enums.CompareEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 可扩展对象
 */
public class SortObjectList {

    private boolean asc;
    private AlgorithmEnum method;
    private CompareEnum compare;
    private List<SortObject> objects;

    private SortObjectList() {
    }

    private static SortObjectList sortObjects;

    public static SortObjectList instance() {
        sortObjects = new SortObjectList();
        sortObjects.asc = false;
        sortObjects.compare = CompareEnum.NUM;
        sortObjects.method = AlgorithmEnum.BubbleSort;
        return sortObjects;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public AlgorithmEnum getMethod() {
        return method;
    }

    public void setMethod(AlgorithmEnum method) {
        this.method = method;
    }

    public CompareEnum getCompare() {
        return compare;
    }

    public void setCompare(CompareEnum compare) {
        this.compare = compare;
    }

    public List<SortObject> getObjects() {
        return objects;
    }

    public void setObjects(List<SortObject> objects) {
        this.objects = objects;
    }

    public void plusObjects(SortObject object) {
        synchronized (this) {
            if (objects == null) {
                objects = new ArrayList<>();
            }
        }
        objects.add(object);
    }
}
