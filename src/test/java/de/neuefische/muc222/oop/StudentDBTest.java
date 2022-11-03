package de.neuefische.muc222.oop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @org.junit.jupiter.api.Test
    void addStudent() {
        Student julia = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        assertEquals(studentDB.students.size(),1);
    }
    @Test
    void check_if_arraylist_contains_new_student() {
        Student julia = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        assertTrue(studentDB.students.contains(julia));
    }
    @Test
    void check_if_arraylist_() {
        Student julia = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        assertEquals(studentDB.students.get(0),julia);
    }

    @Test
    void check_if_arraylist_contains_2_elements() {
        Student julia = new Student();
        Student sergej = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        studentDB.addStudent(sergej);
        assertEquals(studentDB.students.size(),2);
    }
    @Test
    void check_if_one_element_can_be_removed_from_the_arraylist() {
        Student julia = new Student();
        Student sergej = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        studentDB.addStudent(sergej);
        studentDB.removeStudent(julia);
        assertEquals(studentDB.students.size(),1);
    }

    @Test
    void check_if_arraylist_can_be_transformed_as_string() {
        Student julia = new Student();
        Student sergej = new Student();
        List<Student> nenDieAnders = new ArrayList<>();
        StudentDB studentDB = new StudentDB(nenDieAnders);
        studentDB.addStudent(julia);
        String result = studentDB.toString();
        String expectedResult = "[Student{name='null', studentId=0, studentAddress='null'}]";
        assertEquals(result,expectedResult);
    }
}