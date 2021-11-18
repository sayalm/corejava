/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao;

import com.mycompany.program.sayal.classwork.entity.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentDAO {
        void insert(Student s);
    void update(Student s);
    void delete(int id);
    Student getById(int id);
    List<Student> getAll();
}
