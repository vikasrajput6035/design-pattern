package com.designpattern.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
            .addName("Peter Parker")
            .addEmail("peter@gmail.com")
            .addage(26)
            .addHobby("Dancing")
            .build();
        
        Student anotherStudent = new Student.StudentBuilder()
            .addName("Amy Graham")
            .addEmail("amy@gmail.com")
            .build();
        
        System.out.println(student);
        System.out.println(anotherStudent);
    }

}
