/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic_BListe;

/**
 *
 * @author uysal
 */
 public class Node<T> {
    private Node next;
    private T instance;
    private int size;
    public Node(T entity){
        this.instance=entity;
        this.next=null;
        this.size=0;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }

    public int getSize() {
        return size;
    }

    
}
