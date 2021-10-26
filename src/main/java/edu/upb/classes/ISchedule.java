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
public interface ISchedule <T>{
    
    public void add(Appointment session);
    public void deleteId(int id);
    public String printSchedule();
    
}
