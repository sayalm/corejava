/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.fileiomanager.entity;

/**
 *
 * @author User
 */
public class Population {
    
    private String area;
    private int totalChildren;
    private int totalAdult;
    private int totalMale;
    private int totalFemale;
    private int totalHouse;
    private int totalHouseHold;

    public Population() {
    }

    public int getTotalChildren() {
        return totalChildren;
    }

    public void setTotalChildren(int totalChildren) {
        this.totalChildren = totalChildren;
    }

    public int getTotalAdult() {
        return totalAdult;
    }

    public void setTotalAdult(int totalAdult) {
        this.totalAdult = totalAdult;
    }

    public int getTotalMale() {
        return totalMale;
    }

    public void setTotalMale(int totalMale) {
        this.totalMale = totalMale;
    }

    public int getTotalFemale() {
        return totalFemale;
    }

    public void setTotalFemale(int totalFemale) {
        this.totalFemale = totalFemale;
    }

    public int getTotalHouse() {
        return totalHouse;
    }

    public void setTotalHouse(int totalHouse) {
        this.totalHouse = totalHouse;
    }

    public int getTotalHouseHold() {
        return totalHouseHold;
    }

    public void setTotalHouseHold(int totalHouseHold) {
        this.totalHouseHold = totalHouseHold;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
   

    @Override
    public String toString() {
        return "Population{" + "totalChildren=" + totalChildren
                + ", totalAdult=" + totalAdult + ", totalMale=" + totalMale
                + ", totalFemale=" + totalFemale + ", totalHouse="
                + totalHouse + ", totalHouseHold=" + totalHouseHold + '}';

    }

    public String toCSV() {
        return  area+","+totalChildren+ ", " + totalAdult + ", "+ totalMale + ", " + totalFemale + "," +
                "," + totalHouse + ","+ totalHouseHold + "\r\n";
    }
}
