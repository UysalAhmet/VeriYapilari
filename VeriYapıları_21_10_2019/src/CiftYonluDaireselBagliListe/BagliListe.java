/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiftYonluDaireselBagliListe;

/**
 *
 * @author uysal
 */
public class BagliListe {

    private Node head;
    private Node tail;
    private int size;

    public BagliListe() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private void addToHead(int data) {
        Node instance = new Node(data);
        if (this.size == 0) {
            this.head = instance;
            this.tail = instance;
            head.setNext(head);
            head.setPrevious(head);
        } else {
            instance.setNext(head);
            head.setPrevious(instance);
            head = instance;
            head.setPrevious(tail);
            tail.setNext(head);

        }
        size++;
    }

    private void addToTail(int data) {
        Node instance = new Node(data);
        if (this.size == 0) {
            this.addToHead(data);
        } else {
            this.tail.setNext(instance);
            instance.setPrevious(tail);
            this.tail = instance;
            tail.setNext(head);
            head.setPrevious(tail);
        }
        size++;
    }

    public void add(int data) {
        if (this.size == 0 || this.head.getData() >= data) {
            this.addToHead(data);
        } else if (this.tail.getData() <= data) {
            this.addToTail(data);
        } else {
            Node tmp = head;
            while (tmp.getNext().getData() <= data) {
                tmp = tmp.getNext();

            }
            Node instance = new Node(data);
            instance.setNext(tmp.getNext());
            tmp.getNext().setPrevious(instance);
            tmp.setNext(instance);
            size++;
        }
    }

    private void deleteFromHead() {
        if (size == 0) {
            System.out.println("Liste Bos");
        } else if (size == 1) {
            this.head = null;
            this.tail = null;
            size--;
        } else {
            head = head.getNext();
            head.setPrevious(tail);
            tail.setNext(head);
            this.size--;
        }
    }

    private void deleteFromTail() {
        if (size == 0) {
            System.out.println("Liste Bos");
        } else if (size == 1) {
            this.head = null;
            this.tail = null;
            size--;
        } else {
            Node tmp = head;
            while (tmp.getNext() != this.tail) {
                tmp = tmp.getNext();
            }
            this.tail = tmp;
            tmp.setNext(null);
            size--;
        }
    }

    public void delete(int data) {
        if (size == 0) {
            System.out.println("Liste Bos Silme Yapılamaz");
        } else if (this.head.getData() == data) {
            this.deleteFromHead();
        } else if (this.tail.getData() == data) {
            this.deleteFromTail();
        } else {
            Node tmp = head;
            while (tmp.getNext() != null && tmp.getNext().getData() != data) {
                tmp = tmp.getNext();
            }
            if (tmp.getNext() == null) {
                System.out.println("Listede böyle bir eleman bulunamadı");
            } else {
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().setPrevious(tmp);
                size--;
            }
        }
    }

    public void print() {
        Node tmp = head;
        do {
            System.out.print(tmp.getData() + "-");
            tmp = tmp.getNext();
        } while (tmp != head);
        System.out.println("");
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
