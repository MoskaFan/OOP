package de.neuefische.muc222.oop;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    public StudentDB(List<Student> students) {
        this.students = students;
    }

    List<Student> students = new ArrayList<>();

    public void addStudent(Student newStudent){

        students.add(newStudent);
    }

    public List<Student> getAllStudents(){
        return students;

    }

    public Student randomStudent(){
        return students.get((int) Math.floor(Math.random()*(students.size()-1)));

    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}

