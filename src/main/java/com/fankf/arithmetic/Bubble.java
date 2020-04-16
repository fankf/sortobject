package com.fankf.arithmetic;

import com.fankf.bean.SortObject;

/**
 * 冒泡排序
 */
public class Bubble implements Arithmetic {

    @Override
    public void sort(SortObject[] objects, boolean asc) throws NumberFormatException {
        int k = 0;
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                Double sortFiled1 = Double.valueOf(objects[j].getSortFiled());
                Double sortFiled2 = Double.valueOf(objects[j + 1].getSortFiled());
                if (asc) {
                    if (sortFiled1 > sortFiled2) {
                        SortObject sortObject = objects[j];
                        objects[j] = objects[j + 1];
                        objects[j + 1] = sortObject;
                        k++;
                    }
                } else {
                    if (sortFiled1 < sortFiled2) {
                        SortObject sortObject = objects[j];
                        objects[j] = objects[j + 1];
                        objects[j + 1] = sortObject;
                        k++;
                    }
                }
            }
            if (k == 0) {
                break;
            }
        }
    }
}
