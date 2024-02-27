package com.micro.school;

import com.micro.school.client.StudentClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public SchoolService(SchoolRepository schoolRepository, StudentClient studentClient) {
        this.schoolRepository = schoolRepository;
        this.studentClient = studentClient;
    }

    public void saveSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> findAllSchools () {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Long schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(new School(-1L, "not Found", "not Found"));
        var students = studentClient.findAllStudentsBySchool(schoolId);
        var FullSchoolResponse = new FullSchoolResponse(school.getName(), school.getEmail(), students);
        return FullSchoolResponse;
    }
}
