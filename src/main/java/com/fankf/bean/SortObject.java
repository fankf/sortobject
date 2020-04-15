package com.fankf.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SortObject {

    private String sortFiled;
    private Object sortObject;
    private Class<?> clazz;

}
