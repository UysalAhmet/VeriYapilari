/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human;

/**
 *
 * @author uysal
 */
public class Node {
    private Human instance;
    private Node next;

    public Node(Human instance) {
        this.instance = instance;
        this.next=null;
    }

    public Human getInstance() {
        return instance;
    }

    public void setInstance(Human instance) {
        this.instance = instance;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return instance.toString()+"\n**************************";
    }
    
    
}
