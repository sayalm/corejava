/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.collectionexample.service;

import com.mycompany.program.sayal.collectionexample.entity.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentService {
    int insert(Student s);
    int delete(int id);
    Student getById(int id);
    List<Student> getAll();
    
}
