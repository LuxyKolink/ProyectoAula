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
public class Schedule {
    
    private Node actual = null;
    private CircularNodeList<Appointment> citations;

    
    //  Constructor con los 15 espacios disponibles para las citas por día.
    public Schedule () {
        
        citations = new CircularNodeList();
        for(int i = 0; i<=15; i++){
            citations.addNode(null);
        }
        
    }

    //  Agregar cita al espacio indicado.
    public void add(Appointment session){
        
        Appointment newAppointment = session;
        
        // Contador i
        int i = 0;
        
        if (actual == null){
            actual = citations.getFirst();
        }
        
        Node current = Schedule.this.getActual();
        
        while(i <= 15){
            
            if(current.getValue() == null){
                actual = current;
                actual.setValue(newAppointment);
                return;
            }
            
            current = current.getNext();
            i++;
            
        }
    }
    
    
    public void deleteId(int id){
        
        Node deletePatient = citations.getFirst();
        
        int idDeletePatient = id;
        
        for(int i = 0; i<=15; i++){
            
            Appointment appointment = (Appointment) deletePatient.getValue();
            Patient patient = appointment.getPatient();
            
            if(patient.getId() == idDeletePatient){
                
                deletePatient.setValue(null);
                actual = deletePatient;
                return;
                
            }
            
            deletePatient = deletePatient.getNext();
            
        }
        
        System.out.println("El paciente que se está buscando no se encuentra registrado");
        
    }
    
    
    public Node getActual() {
        return actual;
    }

    public void setActual(Node actual) {
        this.actual = actual;
    }

    public CircularNodeList<Appointment> getCitations() {
        return citations;
    }

    public void setCitations(CircularNodeList<Appointment> citations) {
        this.citations = citations;
    }

}
