package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Addy", 22, "Maxwell", LocalDate.of(2023, 1, 15)));
        students.add(new Student("Priya", 23, "Zero Degree", LocalDate.of(2023, 2, 10)));
        students.add(new Student("Ketan", 19, "Microscope", LocalDate.of(2023, 3, 20)));
        students.add(new Student("Savita", 25, "Python", LocalDate.of(2023, 1, 30)));

        // here we list students by name in sorted format
        System.out.println("Students sorted by name:");
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(student -> System.out.println(student.getName() + ", " + student.getAge() + ", " +
                        student.getCourseName() + ", " + student.enrollmentDate));

        // here we search students who enrolled for Java course
        System.out.println("\nStudents enrolled for Java course:");
        students.stream()
                .filter(student -> student.getCourseName().equals("Java"))
                .forEach(student -> System.out.println(student.getName() + ", " + student.getAge() + ", " +
                        student.getCourseName() + ", " + student.enrollmentDate));

        // here we count number of students who enrolled for Python course
        long pythonCourseCount = students.stream()
                .filter(student -> student.getCourseName().equals("Python"))
                .count();
        System.out.println("\nNumber of students enrolled for Python course: " + pythonCourseCount);
    }
}

