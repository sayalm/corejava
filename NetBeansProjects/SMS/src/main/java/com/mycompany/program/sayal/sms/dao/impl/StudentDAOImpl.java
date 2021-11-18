/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.sms.dao.impl;

import com.mycompany.program.sayal.sms.dao.StudentDAO;
import com.mycompany.program.sayal.sms.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDAOImpl implements StudentDAO{
    private List<Student> studentList;

    public StudentDAOImpl(List<Student> studentList) {
        this.studentList= studentList;
    }
    
    @Override
    public void insert(Student s) {
        studentList.add(s);
    }

    @Override
    public void update(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        
       for(Student s: studentList){
            if(s.getId()==id){
                studentList.remove(s);
                return true;
            }
        }
        return false; 
    }

    

    @Override
    public Student getById(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
    
}
