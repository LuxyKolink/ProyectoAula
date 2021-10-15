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
public class Appointment implements Comparable<Appointment>{
    
    private String typeAppointment;
    private Patient patient;

    public Appointment(String typeAppointment, Patient patient) {
        this.typeAppointment = typeAppointment;
        this.patient = patient;
    }

    public String getTypeAppointment() {
        return typeAppointment;
    }

    public void setTypeAppointment(String typeAppointment) {
        this.typeAppointment = typeAppointment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public int compareTo(Appointment o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        
        
        return "Datos de la cita: \n"+patient+ " Tipo de cita: "+typeAppointment;
        
    }
}
