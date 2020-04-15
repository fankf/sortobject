package com.fankf.test;

import com.fankf.Sort;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;
import com.fankf.enums.ArithmeticEnum;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SortObjectList init = SortObjectList.init();
        User user1 = new User(1,"A1","14");
        User user2 = new User(2,"A2","11");
        User user3 = new User(3,"A3","11");
        User user4 = new User(4,"A4","12");
        User user5 = new User(5,"A5","18");
        //对象
        List<SortObject> objects = new ArrayList<>();
        SortObject su1 = new SortObject(user1.getAge(),user1,User.class);
        SortObject su2 = new SortObject(user2.getAge(),user2,User.class);
        SortObject su3 = new SortObject(user3.getAge(),user3,User.class);
        SortObject su4 = new SortObject(user4.getAge(),user4,User.class);
        SortObject su5 = new SortObject(user5.getAge(),user5,User.class);
        objects.add(su1);
        objects.add(su2);
        objects.add(su3);
        objects.add(su4);
        objects.add(su5);
        init.setObjects(objects);
        init.setMethod(ArithmeticEnum.BubbleSort);
        init.setAsc(true);
        List<Object> sort = Sort.sort(init);
        System.out.println(sort);


        SortObject sortObject = new SortObject();
        sortObject.setClazz(User.class);
        Class<?> clazz = sortObject.getClazz();
        System.out.println("---"+clazz.getName());
    }

}