package com.designpattern.builder;

public class Student {
    private String name;
    private String email;
    private String hobby;
    private int age;
    
    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.hobby = studentBuilder.hobby;
        this.age = studentBuilder.age;
    }
    
    public static class StudentBuilder{
        
        private String name;
        private String email;
        private String hobby;
        private int age;
        
        public StudentBuilder addName(String name) {
            this.name = name;
            return this;
        }
        
        public StudentBuilder addEmail(String email) {
            this.email = email;
            return this;
        }
        
        public StudentBuilder addHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }
        
        public StudentBuilder addage(int age) {
            this.age = age;
            return this;
        }
        
        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + ", hobby=" + hobby + ", age=" + age + "]";
    }
}
