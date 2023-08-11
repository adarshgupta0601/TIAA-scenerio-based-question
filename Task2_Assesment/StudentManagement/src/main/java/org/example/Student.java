package org.example;

import java.time.LocalDate;

class Student {
    private String name;
    private int age;
    private String courseName;
    public LocalDate enrollmentDate;

    public Student(String name, int age, String courseName, LocalDate enrollmentDate) {
        this.name = name;
        this.age = age;
        this.courseName = courseName;
        this.enrollmentDate = enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAge() {
        return age;
    }
}

