package org.example.service.impl;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.service.StudentService;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Override
    public List<Student> QueryAllStudent() {
        return studentDao.QueryAllStudent();
    }

    @Override
    public int InsertStudent(Student stu) {
        return studentDao.InsertStudent(stu);
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
