package com.yehhoo.ArrayListLearn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Person> persons = new MyArrayList<>();
        persons.add(new Person(10,"小猪头"));
        persons.add(new Person(20,"段子王"));
        persons.add(new Person(40,"老司机"));
        System.out.println(persons);
        MyArrayList<Integer> ints = new MyArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println(ints);
//        array01.add(10);
//        array01.add(20);
//        array01.add(30);
//        array01.add(40);
//        array01.add(50);
//        array01.add(60);
//        array01.add(70);
//        array01.add(80);
//        array01.add(90);
//        System.out.println(array01.toString());
//        array01.remove(2);
//        System.out.println(array01.toString());
//        array01.add(3,100);
//        array01.add(3,200);
//        array01.add(3,300);
//        array01.add(400);
//        array01.add(500);
//        System.out.println(array01.toString());
    }
}
