/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiftYönlüBagliListe;

/**
 *
 * @author uysal
 */
public class Node {
    private int data;
    private Node next;
    private Node previous;
    
    public Node(int data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
