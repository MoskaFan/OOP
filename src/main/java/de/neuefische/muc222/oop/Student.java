package de.neuefische.muc222.oop;

import java.util.Objects;

public class Student {
    private String name;
    private int studentId;
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

    public Student(String name, int studentId, String studentAddress) {
        this.name = name;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    public String getName() {
        return name;
    }


    public int getStudentId() {
        return studentId;
    }


    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name) && studentAddress.equals(student.studentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, studentAddress);
    }
}
