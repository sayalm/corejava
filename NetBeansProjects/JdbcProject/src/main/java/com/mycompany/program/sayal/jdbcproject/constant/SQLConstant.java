/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.jdbcproject.constant;

/**
 *
 * @author User
 */
public class SQLConstant {
    public static final String COURSE_GETALL="SELECT * FROM " + TableConstant.COURSE_TABLE;
    public static final String COURSE_GETBYID="SELECT * FROM " + TableConstant.COURSE_TABLE + "WHERE id=?";

}
