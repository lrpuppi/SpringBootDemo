package com.spring.demo.dao;

import com.spring.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDao{

    private final Map<UUID, Student> database;


    public FakeStudentDaoImpl() {
        this.database =  new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(studentId,
                new Student(
                        studentId,
                        14,
                        "Alex",
                        "Montana",
                        "Chemistry"
                )
        );
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        database.put(studentId, studentUpdate);
        return 1;
    }

    @Override
    public int deleteSudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
