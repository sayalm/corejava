/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.classwork.dao.impl;

import com.mycompany.program.sayal.classwork.dao.MentorDAO;
import com.mycompany.program.sayal.classwork.entity.Mentor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MentorDAOImpl implements MentorDAO{

    private final List<Mentor>mentorList;
    public MentorDAOImpl() {
    mentorList=new ArrayList<>();
    }
    

    @Override
    public void insert(Mentor s) {
         mentorList.add(s);
    }

    @Override
    public void update(Mentor s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mentor getById(int id) {
for(Mentor s: mentorList){
            if(s.getId()==id){
            }            return s;    }
return null;
    }
    @Override
    public List<Mentor> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
