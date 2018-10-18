package com.company;

public class Student extends Person {
    int cash;
    Student(String f_name,int age,int cash){
        super(f_name,age);
        this.cash=cash;
    }
    @Override
    void Say(){
        System.out.println("Hello everyone, my name is "+f_name+" and I`m "+age+" and I have in my pockets only"+cash+" dollars");
    }
}

