/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.jdbcproject.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface GenericDAO<T> {
    int insert(T t) throws ClassNotFoundException,SQLException;
    List<T> getAll()throws ClassNotFoundException,SQLException;
    T getById(int id)throws ClassNotFoundException,SQLException;
}
