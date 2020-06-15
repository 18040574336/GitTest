package com.lp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Tt {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 12));
		list.add(new Student("李四", 13));
		list.add(new Student("王五", null));
		//Map<String,Integer> map = list.stream().collect(Collectors.toMap(Student::getName,Student::getAge));
        String str = "";
		Matcher mer = Pattern.compile("^[+-]?[0-9.]+$").matcher(str);
		System.out.println(mer.find());
	}
}
