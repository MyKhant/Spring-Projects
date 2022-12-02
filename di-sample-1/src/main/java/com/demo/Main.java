package com.demo;

import com.demo.beans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Student student = context.getBean( Student.class);
//        System.out.println(student.studentInfo());
        context.close();
    }
}
