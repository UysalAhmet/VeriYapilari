/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author uysal
 */
public class Node<T> {
    private T instance;
    private Node next;

    public Node(T instance) {
        this.instance = instance;
        this.next=null;
    }
    
    
    

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
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
        return this.instance.toString()+"\n*********************";
    }
    
}
