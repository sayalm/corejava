/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.fileiomanager.service;

import com.mycompany.program.sayal.fileiomanager.dao.PopulationDAO;
import com.mycompany.program.sayal.fileiomanager.dao.impl.PopulationDAOImpl;
import com.mycompany.program.sayal.fileiomanager.entity.Population;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PopulationService {
    private PopulationDAO populationDAO;
    
    public  PopulationService(){
        populationDAO = new PopulationDAOImpl(new ArrayList<>());
               
    }
    
    public List<Population> getAll() {
      return populationDAO.getAll();
    }

    
    public void insert(Population p) {
        populationDAO.insert(p);
    }

    public List<Population> searchByArea(String area) {
        
        return populationDAO.searchByArea(area);
    }

    public void export(String filepath, String content)throws IOException {
        populationDAO.export(filepath, content);
        
    }
    
}
