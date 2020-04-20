package com.fankf.arithmetic;

import com.fankf.bean.SortObject;
import com.fankf.enums.CompareEnum;
import com.fankf.utils.StringUtils;

import java.math.BigDecimal;

/**
 * @author fan
 * @create 2020-04-18 22:41
 * @description 选择排序
 * @see AbstractAlgorithm
 */
public class Selection extends AbstractAlgorithm {
    @Override
    public void sort(SortObject[] objects, boolean asc) {
        super.sort(objects, asc);
    }

    @Override
    public void sort(SortObject[] objects, boolean asc, CompareEnum compareEnum) {
        if (objects.length == 1) {
            return;
        }
        int flag;
        for (int i = 0; i < objects.length; i++) {
            flag = i;
            for (int j = i + 1; j < objects.length; j++) {
                switch (compareEnum) {
                    case ASCII:
                        String s1 = objects[flag].getSortFiled();
                        String s2 = objects[j].getSortFiled();
                        if (asc && StringUtils.compareTo(s1, s2) > 0) {
                            flag = j;
                        } else if (!asc && StringUtils.compareTo(s1, s2) < 0) {
                            flag = j;
                        }
                        break;
                    case NUM:
                        BigDecimal b1 = new BigDecimal(objects[flag].getSortFiled());
                        BigDecimal b2 = new BigDecimal(objects[j].getSortFiled());
                        if (asc && b1.compareTo(b2) > 0) {
                            flag = j;
                        } else if (!asc && b1.compareTo(b2) < 0) {
                            flag = j;
                        }
                        break;
                }
            }
            super.swap(objects, flag, i);

        }
    }

}

