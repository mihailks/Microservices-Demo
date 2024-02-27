package com.demo.microservicesdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findFirstByEmail(String email);

    void deleteStudentByEmail(String email);
}
