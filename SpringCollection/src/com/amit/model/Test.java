package com.amit.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) throws InterruptedException
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring_config.xml");
       Student student = ac.getBean(Student.class);
      // List<String> listmobiles=student.getMobilelist();
       //listmobiles.stream()x->System.out.println(x).forEach();
       //Set<String> set=student.getMobileset();
     // set.stream().forEach(x->System.out.println(x));
     // Map<String, String> map=student.getMobilemap();
    // map.values().stream().forEach(x->System.out.println(x));
    // Properties pro=student.getMobileprops();
   //  String m=pro.getProperty("8");
    // System.out.println(m);
     
     
    		 }

}
