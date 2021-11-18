/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao.impl;

import com.mycompany.program.sayal.classwork.dao.CourseDAO;
import com.mycompany.program.sayal.classwork.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CourseDAOImpl implements CourseDAO {
 private final List<Course> courseList;

    public CourseDAOImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public int insert(Course s) {
        return (courseList.add(s))?1:0;
    }

    @Override
    public int update(Course s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                courseList.remove(c);
                return 1;
            }
            
        }
        return 0;
    }

    @Override
    public Course getById(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                return c;
            }
            
        }
        return null;
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }

   
    
}
