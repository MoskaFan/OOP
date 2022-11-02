package de.neuefische.muc222.oop;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private String studentAddress;
    public Student() {


    }
    public Student(String name) {
        this.name = name;

    }
    public Student(String name, String studentAddress) {
        this.name = name;
        this.studentAddress = studentAddress;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public Student(String name, int id, String studentAddress) {
        this.name = name;
        this.id = id;
        this.studentAddress = studentAddress;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }


    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + id +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && studentAddress.equals(student.studentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, studentAddress);
    }
}
