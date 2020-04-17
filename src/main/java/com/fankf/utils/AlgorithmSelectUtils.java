package com.fankf.utils;

import com.fankf.arithmetic.Algorithm;
import com.fankf.arithmetic.Bubble;
import com.fankf.bean.SortObject;

import java.util.List;

public class AlgorithmSelectUtils {

    public static Algorithm getAlgorith(List<SortObject> sortObject) {
        return new Bubble();
    }
}
