package de.neuefische.muc222.oop;

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
}
