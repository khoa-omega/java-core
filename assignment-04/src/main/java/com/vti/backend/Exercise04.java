package com.vti.backend;

import com.vti.entity.Student;

public class Exercise04 {
    public void question01() {
        Student student = new Student();
        student.setScore(5.0);
        student.showInfo();
        student.plusScore(4.5);
        student.showInfo();
    }
}
