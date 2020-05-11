package com.fankf.test;

import com.fankf.Sort;
import com.fankf.bean.SortObject;
import com.fankf.enums.AlgorithmEnum;
import com.fankf.enums.CompareEnum;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {


        User user1 = new User(1, "A1", "14");
        User user2 = new User(2, "A2", "11");
        User user3 = new User(3, "A3", "11");
        User user4 = new User(4, "A4", "12");
        User user5 = new User(5, "A5", "18");
        //对象
        List<SortObject> objects = new ArrayList<>();
        SortObject su1 = new SortObject(user1.getAge(), user1);
        SortObject su2 = new SortObject(user2.getAge(), user2);
        SortObject su3 = new SortObject(user3.getAge(), user3);
        SortObject su4 = new SortObject(user4.getAge(), user4);
        SortObject su5 = new SortObject(user5.getAge(), user5);
        objects.add(su1);
        objects.add(su2);
        objects.add(su3);
        objects.add(su4);
        objects.add(su5);

        long t1 = Calendar.getInstance().getTimeInMillis();
        List<User> sort = Sort.sort(objects, AlgorithmEnum.BubbleSort, true, CompareEnum.NUM);
        long t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("执行时间:" + (t2 - t1));
        System.out.println(sort);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        List<User> age = Sort.sort(users, "age", AlgorithmEnum.BubbleSort);
        System.out.println(age);

    }
}
