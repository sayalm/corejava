/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.collectionexample.service.iimpl;

import com.mycompany.program.sayal.collectionexample.dao.StudentDAO;
import com.mycompany.program.sayal.collectionexample.dao.impl.StudentDAOImpl;
import com.mycompany.program.sayal.collectionexample.entity.Student;
import com.mycompany.program.sayal.collectionexample.service.StudentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;

    public StudentServiceImpl() {
        studentDAO = new StudentDAOImpl(new ArrayList<>());
    }
    
    
    @Override
    public int insert(Student s) {
        return studentDAO.insert(s);
    }

    @Override
    public int delete(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
    
}
