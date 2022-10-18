package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Sidorov Ivan");
        student.setGroup("9bi");
        student.setDateOfAdmission(new Date());

        System.out.println(student.getFullName() + " student of group - " + student.getGroup() + " from " + student.getDateOfAdmission());
    }
}
