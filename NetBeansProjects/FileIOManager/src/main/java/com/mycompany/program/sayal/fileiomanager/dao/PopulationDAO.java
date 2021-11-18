/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.fileiomanager.dao;

import com.mycompany.program.sayal.fileiomanager.entity.Population;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author User
 */
public interface PopulationDAO {
    
    List<Population> getAll();
    void insert(Population p);
    List<Population> searchByArea(String area);
    void export(String filepath,String content)throws IOException;
}
