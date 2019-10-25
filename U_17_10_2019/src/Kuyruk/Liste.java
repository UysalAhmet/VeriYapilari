/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuyruk;

/**
 *
 * @author uysal
 */
public class Liste {

    Node bas;
    Node son;
    int elemansayisi;

    public Liste() {
        son = null;
        bas = null;
        elemansayisi = 0;
    }

    public void basaEkle(int data) {
        Node eleman = new Node(data);
        if (elemansayisi == 0) {
            bas = eleman;
            son = eleman;
            elemansayisi++;
        } else {
            eleman.next = bas;
            bas = eleman;
            elemansayisi++;
        }
    }

    public void sonaEkle(int data) {
        Node eleman = new Node(data);
        if (elemansayisi == 0) {
            bas = eleman;
            son = eleman;
            elemansayisi++;
        } else {
            son.next = eleman;
            son = eleman;
            elemansayisi++;
        }
    }

    public void Ekle(int data) {
        if (elemansayisi == 0 || bas.data >= data) {
            this.basaEkle(data);
        } else if (son.data <= data) {
            this.sonaEkle(data);
        } else {
            Node tmp = bas;
            while (tmp.next != null && tmp.next.data < data) {
                tmp = tmp.next;
            }
            if (tmp.next == null) {
                this.sonaEkle(data);
            } else {
                Node eleman = new Node(data);
                eleman.next = tmp.next;
                tmp.next = eleman;
                elemansayisi++;
            }
        }
    }

    public void bastanSil() {
        if (elemansayisi == 0) {
            System.out.println("Liste bos");
        } else if (elemansayisi == 1) {
            bas = null;
            son = null;
            elemansayisi--;
        } else {
            bas = bas.next;
            elemansayisi--;
        }
    }

    public void sondanSil() {
        if (elemansayisi == 0) {
            System.out.println("Liste bos");
        } else if (elemansayisi == 1) {
            bas = null;
            son = null;
            elemansayisi--;
        }
        else{
            Node tmp =bas;
            while(tmp.next!=son){
                tmp=tmp.next;
            }
            tmp.next=null;
            son=tmp;
        }
    }
    public void Sil(int data){
          if (elemansayisi == 0) {
            System.out.println("Liste bos");
        }
          if(bas.data==data){
              this.bastanSil();
          }
          else if(son.data==data){
              this.sondanSil();
          }
          else{
              Node tmp=bas;
              while(tmp.next!=null && tmp.next.data!=data){
                  tmp=tmp.next;
              }
              if(tmp.next==null){
                  System.out.println("Listede bulunamadı");
              }
              else{
                  tmp.next=tmp.next.next;
                  elemansayisi--;
              }
          }
    }

    public void yazdir() {
        Node tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.next;
        }
        System.out.println("");
    }

}
