/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.sistemaacademico;

/**
 *
 * @author vitor
 */

public class Student {
    private int ra;
    private String name;
    private int birthYear;
    
    public Student(int ra, String name, int birthYear) {
        this.ra = ra;
        this.name = name;
        this.birthYear = birthYear;
    }
    
    // getters
    public int getRa() {
        return ra;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // setters
    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
