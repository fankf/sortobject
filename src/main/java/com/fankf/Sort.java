package com.fankf;

import com.fankf.arithmetic.Arithmetic;
import com.fankf.arithmetic.Bubble;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;
import com.fankf.enums.ArithmeticEnum;
import com.fankf.enums.SortErrorEnum;
import com.fankf.utils.StringCheckUtils;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static List<Object> sort(SortObjectList objectList){

        try {
            check(objectList);
        } catch (SortException e) {
            e.printStackTrace();
        }

        ArithmeticEnum method = objectList.getMethod();

        Arithmetic arithmetic;
        switch (method) {
            case BubbleSort:
                arithmetic = new Bubble();
            default:
                arithmetic = new Bubble();
        }

        List<Object> result = new ArrayList<>();
        List<SortObject> objects = objectList.getObjects();
        SortObject[] objects1 = new SortObject[objects.size()];
        for (int i = 0; i < objects.size(); i++) {
            objects1[i] = objects.get(i);
        }
        arithmetic.sort(objects1, objectList.isAsc());

        for (SortObject sortObject : objectList.getObjects()) {
            result.add(sortObject.getSortObject());
        }
        return result;
    }

    private static void check(SortObjectList objectList) throws SortException {
        //排序字段不能为空
        List<SortObject> objects = objectList.getObjects();
        for (SortObject object : objects) {
            if(StringCheckUtils.isBlank(object.getSortFiled())){
                throw new SortException(SortErrorEnum.SORT_ERROR_001);
            }

        }
    }
}
