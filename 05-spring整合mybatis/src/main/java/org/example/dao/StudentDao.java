package org.example.dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> QueryAllStudent();
    int InsertStudent(Student stu);
}
