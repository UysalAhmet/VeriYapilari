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
public class Bliste<T> {

    private Node head;
    private Node tail;
    private int size;

    public Bliste() {
        head = null;
        tail = null;
    }

    public void addToHead(T entity) {
        Node instance= new Node(entity);
        if (head == null) {
            head = instance;
            tail = instance;
            size++;
        } else {
            instance.setNext(head);
            head = instance;
            size++;
        }
    }

    public void addToTail(T entity) {
        Node instance= new Node(entity);
        if (head == null) {
            this.addToHead(entity);
        } else {
            tail.setNext(instance);
            tail = instance;
            size++;
        }
    }

    public void add(T instance) {
        
        if (head == null) {
            this.addToHead(instance);
        } else if (head.getInstance().equals(instance)) {
            this.addToHead(instance);
        } else {
            this.addToTail(instance);
        }
    }

    public void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.getInstance()+"-");
            tmp=(Node) tmp.getNext();
        }
        System.out.println("");
    }
    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
//////////////////
    
//    
//    private class Node<T> {
//    private Node next;
//    private T instance;
//    private int size;
//    public Node(T entity){
//        this.instance=entity;
//        this.next=null;
//        this.size=0;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    public T getInstance() {
//        return instance;
//    }
//
//    public void setInstance(T instance) {
//        this.instance = instance;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    
//}

}




