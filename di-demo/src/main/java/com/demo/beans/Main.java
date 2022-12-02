package com.demo.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Knight knight = new Knight();
//        knight.setQuest(new SlyDragonQuest());
//        System.out.println(knight.goQuest());
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.goQuest());
        context.close();
    }
}
