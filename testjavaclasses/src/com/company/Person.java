package com.company;

public class Person {
    String f_name;
    int age;
    Person(String f_name,int age){
        this.f_name=f_name;
        this.age=age;
    }
    void Say(){
        System.out.println("Hello everyone, my name is "+f_name+" and I`m "+age);
    }
}
