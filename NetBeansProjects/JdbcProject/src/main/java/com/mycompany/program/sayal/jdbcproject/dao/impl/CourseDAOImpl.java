/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.jdbcproject.dao.impl;

import com.mycompany.program.sayal.jdbcproject.constant.SQLConstant;
import com.mycompany.program.sayal.jdbcproject.dao.CourseDAO;
import com.mycompany.program.sayal.jdbcproject.dbutil.DbConnection;
import com.mycompany.program.sayal.jdbcproject.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CourseDAOImpl implements CourseDAO {

    private DbConnection conn = new DbConnection();

    @Override
    public int insert(Course c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_courses(name,description,fees,duration,duration_type,status) VALUES(?,?,?,?,?,?)";

        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setDouble(3, c.getFees());
        stmt.setInt(4, c.getDuration());
        stmt.setString(5, c.getDurationType());
        stmt.setBoolean(6, c.isStatus());
        int result = conn.executeUpdate();
        conn.close();
        return result;
    }

    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
        List<Course> courseList = new ArrayList<>();
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.COURSE_GETALL);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            courseList.add(mapData(rs));
        }
        conn.close();
        return courseList;
    }

    @Override
    public Course getById(int id) throws ClassNotFoundException, SQLException {
        Course c = null;
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.COURSE_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {

            c = mapData(rs);

        }
        conn.close();
        return c;
    }

    private Course mapData(ResultSet rs) throws SQLException {
        Course c = new Course();
        c.setId(rs.getInt("id"));
        c.setName(rs.getString("name"));
        c.setDescription(rs.getString("description"));
        c.setFees(rs.getDouble("fees"));
        c.setDuration(rs.getInt("Duration"));
        c.setDurationType(rs.getString("duration_type"));
        c.setAddedDate(rs.getDate("added_date"));
        if (rs.getDate("modified_date") != null) {
            c.setModifiedDate(rs.getDate("modified_date"));
        }
        c.setStatus(rs.getBoolean("status"));
        return c;

    }

}
