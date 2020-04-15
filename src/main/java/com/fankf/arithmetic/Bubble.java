package com.fankf.arithmetic;

import com.fankf.bean.SortObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 冒泡排序
 */
public class Bubble implements Arithmetic {

    @Override
    public void sort(List<SortObject> objects, boolean asc) {
        for (int i = 0; i < objects.size(); i++) {
            for (int j = 0; j < objects.size() - 1; j++) {
                Double sortFiled1 = Double.valueOf(objects.get(j).getSortFiled());
                Double sortFiled2 = Double.valueOf(objects.get(j + 1).getSortFiled());
                if (asc) {
                    if (sortFiled1 > sortFiled2) {
                        Collections.swap(objects, j, j + 1);
                    }
                } else {
                    if (sortFiled1 < sortFiled2) {
                        Collections.swap(objects, j, j + 1);
                    }
                }
            }
        }
    }
}
