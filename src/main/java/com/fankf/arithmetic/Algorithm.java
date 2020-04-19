package com.fankf.arithmetic;

import com.fankf.bean.SortObject;
import com.fankf.enums.CompareEnum;

/**
 * @author fan
 * @create 2020-04-18 22:47
 * @description
 * @see
 */
public interface Algorithm {

    void sort(SortObject[] objects, boolean asc, CompareEnum compareEnum);
}
