/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.fileiomanager.dao.impl;

import com.mycompany.program.sayal.fileiomanager.dao.PopulationDAO;
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
public class PopulationDAOImpl implements PopulationDAO{
    private List<Population> populationList;
    public PopulationDAOImpl(List<Population> populationList){
        this.populationList = populationList;
    }
    @Override
    public List<Population> getAll() {
      return populationList;
    }

    @Override
    public void insert(Population p) {
        populationList.add(p);
    }

    @Override
    public List<Population> searchByArea(String area) {
        
        List<Population> dataList = new ArrayList<Population>();
        // Java 8
        populationList.forEach(p->{
            if(p.getArea().equalsIgnoreCase(area)){
                dataList.add(p);
            }
        });
        return dataList;
    }

    @Override
    public void export(String filepath, String content)throws IOException {
        FileWriter writer = new FileWriter(new File(filepath));
        writer.write(content);
        writer.close();
    }
    
}
