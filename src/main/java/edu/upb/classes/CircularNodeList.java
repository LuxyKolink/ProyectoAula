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
public class CircularNodeList <T extends Comparable<T>> {
    
    private Node first;
    private Node last;
    private Node current;
    

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }
    
    
    public void print(){
        
        Node current = first;
        
        for(int i = 0; i < 15; i++){
            System.out.println(current.getValue());
            System.out.println();
            current = current.getNext();
        }
        
    }
    

    public void addNode(T appointment) {
        
        Node<T> current = new Node(appointment);
        
        if (first == null){
            first = current;
            last = current;
            first.setNext(first);
            first.setPrevious(last);
        } else {
            last.setNext(current);
            current.setNext(first);
            current.setPrevious(last);
            last = current;
            first.setPrevious(last);
        }
    }
    
}
