/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao.impl;

import com.mycompany.program.sayal.classwork.dao.StudentDAO;
import com.mycompany.program.sayal.classwork.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDAOImpl implements StudentDAO {

   private final List<Student> studentList;
    public StudentDAOImpl() {
       studentList=new ArrayList<>();
    }
    

    @Override
    public void insert(Student s) {
   studentList.add(s); 
    }

    @Override
    public void update(Student s) {
   }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
            }            return s;
    }
   return null; 
   }
    @Override
     public List<Student> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
