package com.demo.microservicesdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findFirstByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteStudentByEmail(email);
    }
}
