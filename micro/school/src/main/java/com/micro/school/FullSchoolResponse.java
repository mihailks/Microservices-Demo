package com.micro.school;

import java.util.List;

public class FullSchoolResponse {

    private String name;
    private String email;
    private List<Student> students;

    public FullSchoolResponse() {
    }

    public FullSchoolResponse(String name, String email, List<Student> students) {
        this.name = name;
        this.email = email;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public FullSchoolResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FullSchoolResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public FullSchoolResponse setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}
