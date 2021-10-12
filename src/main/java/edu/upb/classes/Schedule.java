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

    public Schedule () {
        
        citations = new CircularNodeList();
        for(int i = 0; i<=15; i++){
            citations.add(null);
        }
        
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
