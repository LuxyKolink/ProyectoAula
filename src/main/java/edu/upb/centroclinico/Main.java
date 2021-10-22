/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.centroclinico;
import edu.upb.classes.Patient;
import edu.upb.classes.Appointment;
import edu.upb.classes.Schedule;
import javax.swing.JOptionPane;
/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Schedule schedule = new Schedule();
        
        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar \n3. Eliminar \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del paciente:"));
                    String name = JOptionPane.showInputDialog("Digite el nombre del paciente:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de documento/cédula del paciente:"));
                    String ensurance = JOptionPane.showInputDialog("Digite la EPS/afiliación del paciente:");
                    
                    Patient patient = new Patient(age, name, id, ensurance);
                    
                    String typeAppointment = JOptionPane.showInputDialog("Digite el tipo de la cita:");
                    
                    Appointment appointment = new Appointment(typeAppointment, patient);
                    
                    schedule.add(appointment);
                    break;

                case 2:
                    break;

                case 3:
                    break;
                case 4:
                    
                    schedule.getCitations().print();
                    //String schedules = schedule.getCitations().print();
                    //JOptionPane.showMessageDialog(null, schedule);
                    break;
            }

        } while (input != 0);
        
        
        /*
        Schedule schedule1 = new Schedule();
        
        Patient patient1 = new Patient(12, "Rodrigo", 1005289730, "Coonmeva");
        Appointment appointment1 = new Appointment("Ortodoncia", patient1);
        
        Patient patient2 = new Patient(25, "Adriana", 1034562166, "Coonmeva");
        Appointment appointment2 = new Appointment("Ortodoncia", patient2);
        
        schedule1.add(appointment1);
        schedule1.add(appointment2);
        
        schedule1.getCitations().print();
        
        schedule1.deleteId(1034562166);
        
        System.out.println("---------------------------------------------");
        
        schedule1.getCitations().print();
        */
        
        
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
