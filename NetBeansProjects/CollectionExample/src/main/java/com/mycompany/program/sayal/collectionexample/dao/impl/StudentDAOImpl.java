/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.collectionexample.dao.impl;

import com.mycompany.program.sayal.collectionexample.dao.StudentDAO;
import com.mycompany.program.sayal.collectionexample.entity.Student;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author User
 */
public class StudentDAOImpl implements StudentDAO {
    private List<Student> studentList;
    
    public StudentDAOImpl(List<Student> studentList) {
      this.studentList=studentList; 
     
    }
    
    
    @Override
    public int insert(Student s) {
       return (studentList.add(s)) ?1:0;
    }

    @Override
    public int delete(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
                studentList.remove(s);
                return 1;
            }
        }
        return 0;
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
