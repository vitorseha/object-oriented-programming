/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

/**
 *
 * @author vitor
 */
public class Course {

    private int id;
    private String name;
    private String category;
    
    public Course (int id){
        this.id = id;
    }
    
    public Course (String name, String category){
        this.name = name;
        this.category = category;
}

    public Course(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}

