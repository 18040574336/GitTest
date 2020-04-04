package com.lp.test.model;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherService {


    static List<Teacher> teachers = Arrays.asList(
      new Teacher("张三","男",18),
      new Teacher("李四","女",19),
      new Teacher("王五","男",20),
      new Teacher("赵六","女",21)
    );


    static List<Teacher> filterSex(List<Teacher> lst,TeacherFilterInterface i){
        return lst.stream().filter(p->i.check(p)).collect(Collectors.toList());
    }
    static List<Teacher> filterSex(List<Teacher> lst,Integer age){
        return lst.stream().filter(p->p.getAge()>19).collect(Collectors.toList());
    }


    public static void main(String[] args) {
       // System.out.println(filterSex(teachers,"女"));
       System.out.println(filterSex(teachers,new TeacherFilterSextInterfaceImpl()));
    }
}
