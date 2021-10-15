/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.centroclinico;
import edu.upb.classes.Patient;
import edu.upb.classes.Appointment;
import edu.upb.classes.Schedule;
/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Schedule schedule1 = new Schedule();
        
        Patient patient1 = new Patient(12, "Rodrigo", 1005289730, "Coonmeva");
        Appointment appointment1 = new Appointment("Ortodoncia", patient1);
        
        Patient patient2 = new Patient(25, "Adriana", 1034562166, "Coonmeva");
        Appointment appointment2 = new Appointment("Ortodoncia", patient2);
        
        schedule1.add(appointment1);
        schedule1.add(appointment2);
        
        schedule1.getCitations().print();
        
        /*
        System.out.println("---------------------------------------------");
        
        Schedule schedule2 = new Schedule();
        
        Patient patient2 = new Patient(12, "Rodrigo", 1005289730, "Coonmeva");
        Appointment appointment2 = new Appointment("Ortodoncia", patient2);
        
        schedule2.add(appointment2);
        
        schedule2.getCitations().print();
        */

    }
    
}
