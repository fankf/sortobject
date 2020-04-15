package com.fankf.bean;

import com.fankf.enums.ArithmeticEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
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
    private List<SortObject> objects;

    private SortObjectList(){}

    private static SortObjectList sortObjects;

    public static SortObjectList init(){
        sortObjects = new SortObjectList();
        sortObjects.asc = false;
        sortObjects.method = ArithmeticEnum.BubbleSort;
        return sortObjects;
    }
}
