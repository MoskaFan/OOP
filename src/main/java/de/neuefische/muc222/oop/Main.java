package de.neuefische.muc222.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student emma = new Student("Emma", 12345);
        Student samantha = new Student("Emma", 12345);


        List<Student> nennDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nennDieAnders);
        studentDB.addStudent(emma);
        studentDB.addStudent(samantha);
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.getAllStudents());
    }
}