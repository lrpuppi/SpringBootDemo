package com.spring.demo.dao;

import com.spring.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("mongoDB")
public class MongoDBStudentDaoImpl implements StudentDao {

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return null;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteSudentById(UUID studentId) {
        return 0;
    }
}
