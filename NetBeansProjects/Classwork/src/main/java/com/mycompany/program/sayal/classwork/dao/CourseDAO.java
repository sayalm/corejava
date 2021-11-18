/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao;

import com.mycompany.program.sayal.classwork.entity.Course;
import java.util.List;

/**
 *
 * @author User
 */
public interface CourseDAO {

    int insert(Course s);
    int update(Course s);
    int delete(int id);
    Course getById(int id);
    List<Course> getAll();
 
}
