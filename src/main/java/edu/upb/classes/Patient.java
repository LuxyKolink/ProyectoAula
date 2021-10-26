/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.classes;

/**
 *
 * @author santi
 */
public class Patient {
    
    private int age;
    private String name;
    private int id;
    private String ensurance;

    public Patient(int age, String name, int id, String ensurance) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.ensurance = ensurance;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnsurance() {
        return ensurance;
    }

    public void setEnsurance(String ensurance) {
        this.ensurance = ensurance;
    }
    
    @Override
    public String toString(){
        
        return "Edad: " +age+ " \nNombre: "+name+" \nIdentificación: "+id+" \nAfiliación: "+ensurance;
        
    }
}
