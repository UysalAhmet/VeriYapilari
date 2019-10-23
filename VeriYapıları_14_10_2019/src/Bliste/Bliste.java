/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bliste;

/**
 *
 * @author uysal
 */
public class Bliste {

    private Node head;
    private Node tail;
    private int size;

    public Bliste() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void addToHead(int data) {
        Node entity = new Node(data);
        if (head == null) {
            head = entity;
            tail = entity;
            size++;
        } else {
            entity.setNext(head);
            head=entity;
            size++;
        }
    }

    public void addToTail(int data) {
        if (head == null) {
            this.addToHead(data);
        } else {
            Node entity = new Node(data);
            tail.setNext(entity);
            tail = entity;
            size++;
        }
    }

    public void add(int data) {
        if (head == null) {
            this.addToHead(data);
        } else if (head.getData() > data) {
            this.addToHead(data);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null && tmp.getNext().getData() < data) {
                tmp = tmp.getNext();
            }
            if (tmp.getNext() == null) {
                this.addToTail(data);
            } else {
                Node entity = new Node(data);
                entity.setNext(tmp.getNext());
                tmp.setNext(entity);
            }
        }
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getData() + "-");
            tmp = tmp.getNext();
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

}
