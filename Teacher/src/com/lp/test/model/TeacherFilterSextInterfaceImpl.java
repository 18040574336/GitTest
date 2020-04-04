package com.lp.test.model;

public class TeacherFilterSextInterfaceImpl implements  TeacherFilterInterface {
    @Override
    public boolean check(Teacher teacher) {
        return "男".equals(teacher.getSex());
    }
}
