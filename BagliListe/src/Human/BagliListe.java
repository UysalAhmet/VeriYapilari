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
public class BagliListe {

    private Node head;
    private Node tail;
    private int elemansayisi;

    public BagliListe() {
        this.head = null;
        this.tail = null;
        this.elemansayisi = 0;
    }

    private void basaEkle(Node instance) {
        if (this.elemansayisi == 0) {
            head = instance;
            tail = instance;
            elemansayisi++;
        } else {
            instance.setNext(head);
            this.head = instance;
            this.elemansayisi++;
        }
    }

    private void sonaEkle(Node instance) {
        if (this.elemansayisi == 0) {
            this.basaEkle(instance);
        } else {
            this.tail.setNext(instance);
            this.tail = instance;
            this.elemansayisi++;
        }
    }

    public void Ekle(Node instance) {
        if (this.elemansayisi == 0 || this.head.getInstance().getYas() >= instance.getInstance().getYas()) {
            this.basaEkle(instance);
        } else if (this.tail.getInstance().getYas() <= instance.getInstance().getYas()) {
            this.sonaEkle(instance);
        } else {
            Node tmp = head;
            while(tmp.getNext()!=null && tmp.getNext().getInstance().getYas()<=instance.getInstance().getYas()){
                tmp=tmp.getNext();
            }
            instance.setNext(tmp.getNext());
            tmp.setNext(instance);
            this.elemansayisi++;
        }
    }
    private void bastanSil(){
        if(this.elemansayisi==0){
            System.out.println("Liste Boş");
        }
        else if(this.elemansayisi==1){
            this.head=null;
            this.tail=null;
            elemansayisi--;
        }
        else{
            this.head=this.head.getNext();
            this.elemansayisi--;
        }
    }
    private void sondanSil(){
        if(this.elemansayisi==0){
            System.out.println("Liste Boş");
        }
        else if(this.elemansayisi==1){
            this.head=null;
            this.tail=null;
            this.elemansayisi--;
        }
        else{
            Node tmp = head;
            while(tmp.getNext()!=tail){
                tmp=tmp.getNext();
            }
            tmp.setNext(null);
            tail=tmp;
            this.elemansayisi--;
            
        }
    }
    public void Sil(Node instance){
        if(this.elemansayisi==0){
            System.out.println("Liste Boş");
        }
        else if(head.getInstance().equals(instance.getInstance())){
            this.bastanSil();
        }
        else if(tail.getInstance().equals(instance.getInstance())){
            this.sondanSil();
        }
        else {
            Node tmp =head;
            while(tmp.getNext()!=null && !(tmp.getNext().getInstance().equals(instance.getInstance()))){
                tmp=tmp.getNext();
            }
            if(tmp.getNext()==null){
                System.out.println("Listede Böyle Bir İnsan Bulunamadı");
            }
            else{
                tmp.setNext(tmp.getNext().getNext());
                this.elemansayisi--;
            }
        }
    }
    public void yazdir(){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.toString());
            tmp=tmp.getNext();
        }
        System.out.println("");
    }

    //GETTER SETTER//
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

    public int getElemansayisi() {
        return elemansayisi;
    }

    public void setElemansayisi(int elemansayisi) {
        this.elemansayisi = elemansayisi;
    }

}
