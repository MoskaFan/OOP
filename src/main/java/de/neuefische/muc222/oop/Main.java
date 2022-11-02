package de.neuefische.muc222.oop;

import de.neuefische.muc222.oop.Student;

public class Main {
    public static void main(String[] args) {

        Student emma = new Student("Emma", 12345, "Wuppertal Muster-Strasse 123");
        Student samantha = new Student("Emma", 12345, "Wuppertal Muster-Strasse 123");
        System.out.println(emma.getName());
        System.out.println(emma.getStudentAddress());
        System.out.println(emma.getStudentId());
        System.out.println(emma);
        System.out.println(emma.equals(samantha));
    }
}