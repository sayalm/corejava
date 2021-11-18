/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao;

import com.mycompany.program.sayal.classwork.entity.Mentor;
import java.util.List;

/**
 *
 * @author User
 */
public interface MentorDAO {
     void insert(Mentor s);
    void update(Mentor s);
    void delete(int id);
    Mentor getById(int id);
    List<Mentor> getAll();
}
