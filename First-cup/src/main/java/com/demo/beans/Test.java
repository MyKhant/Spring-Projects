package com.demo.beans;

class Parent{
    int i = 10;
    Parent(){
        test();
    }
    public void test(){
        System.out.println(i);
    }
}
public class Test extends Parent{
    public Test(){
        super();
    }
    int i = 100;
    public void test(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }



}
