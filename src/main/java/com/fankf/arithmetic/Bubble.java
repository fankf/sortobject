package com.fankf.arithmetic;

import com.fankf.bean.SortObject;
import com.fankf.enums.CompareEnum;
import com.fankf.utils.StringUtils;

import java.math.BigDecimal;

/**
 * 冒泡排序
 */
public class Bubble extends AbstractAlgorithm {

    @Override
    public void sort(SortObject[] objects, boolean asc) {
        super.sort(objects,asc);
    }

    @Override
    public void sort(SortObject[] objects, boolean asc, CompareEnum compareEnum) {
        int k = 0;
        if (objects.length == 1) {
            return;
        }
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                switch (compareEnum) {
                    case ASCII:
                        String s1 = objects[j].getSortFiled();
                        String s2 = objects[j + 1].getSortFiled();
                        if (asc && StringUtils.compareTo(s1, s2) > 0) {
                            super.swap(objects,j,j + 1);
                            k++;
                        } else if (!asc && StringUtils.compareTo(s1, s2) < 0) {
                            super.swap(objects,j,j + 1);
                            k++;
                        }
                        break;
                    case NUM:
                        BigDecimal b1 = new BigDecimal(objects[j].getSortFiled());
                        BigDecimal b2 = new BigDecimal(objects[j + 1].getSortFiled());
                        if (asc && b1.compareTo(b2) > 0) {
                            super.swap(objects,j,j + 1);
                            k++;
                        } else if (!asc && b1.compareTo(b2) < 0) {
                            super.swap(objects,j,j + 1);
                            k++;
                        }
                        break;
                }

            }
            if (k == 0) {
                break;
            }
        }
    }
}
