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
        } else {
            instance.setNext(head);
            head.setPrevious(instance);
            head = instance;

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
            this.tail=instance;
        }
        size++;
    }
    public void add(int data){
        if(this.size==0 || this.head.getData()>=data){
            this.addToHead(data);
        }
        else if (this.tail.getData()<=data){
            this.addToTail(data);
        }
        else{
            Node tmp=head;
            while(tmp.getNext().getData()<=data){
                tmp=tmp.getNext();
                
            }
            Node instance= new Node(data);
            instance.setNext(tmp.getNext());
            tmp.getNext().setPrevious(instance);
            tmp.setNext(instance);
        }
    }
    private void deleteFromHead(){
        if(size==0){
            System.out.println("Liste Bos");
        }
        else if(size==1){
            this.head=null;
            this.tail=null;
            size--;
        }
        else{
            head=head.getNext();
        }
    }
    private void deleteFromTail(){
        if(size==0){
            System.out.println("Liste Bos");
        }
        else if(size==1){
            this.head=null;
            this.tail=null;
            size--;
        }
        else{
            Node tmp=head;
            while(tmp.getNext()!=this.tail){
                tmp=tmp.getNext();
            }
            this.tail=tmp;
            tmp.setNext(null);
            size--;
        }
    }
    public void delete(int data){
        if(size==0){
            System.out.println("Liste Bos Silme Yapılamaz");
        }
        else if(this.head.getData()==data){
            this.deleteFromHead();
        }
        else if(this.tail.getData()==data){
            this.deleteFromTail();
        }
        else{
            Node tmp=head;
            while(tmp.getNext()!=null && tmp.getNext().getData()!=data){
                tmp=tmp.getNext();
            }
            if(tmp.getNext()==null){
                System.out.println("Listede böyle bir eleman bulunamadı");
            }
            else {
                tmp.setNext(tmp.getNext().getNext());
                tmp.getNext().setPrevious(tmp);
                size--;
            }
        }
    }
    public void print(){
        Node tmp =head;
        while(tmp!=null){
            System.out.print(tmp.getData()+"-");
            tmp=tmp.getNext();
        }
        System.out.println("");
    }
}
