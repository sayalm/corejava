/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.jdbcproject;

import com.mycompany.program.sayal.jdbcproject.dao.CourseDAO;
import com.mycompany.program.sayal.jdbcproject.dao.impl.CourseDAOImpl;
import com.mycompany.program.sayal.jdbcproject.dbutil.DbConnection;
import com.mycompany.program.sayal.jdbcproject.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        try {
               CourseDAO courseDAO = new CourseDAOImpl();
               
               Course course = new Course();
               course.setName("Python ");
               course.setDescription("Python ");
               course.setFees(20000);
               course.setDuration(8);
               course.setDurationType("WEEK");
               course.setStatus(true);
               
               courseDAO.insert(course);
               courseDAO.getAll().forEach(c-> {
                   System.out.println(c.toString());
               });
               System.out.println("Get By Id: "+ courseDAO.getById(2));
         }catch(ClassNotFoundException | SQLException ce){
             System.out.println(ce.getMessage());
         }
    }
}
