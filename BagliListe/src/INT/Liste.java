/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT;

/**
 *
 * @author uysal
 */
public class Liste {

    Node bas;
    Node son;
    int elemansayisi;

    public Liste() {
        this.bas = null;
        this.son = null;
        this.elemansayisi = 0;
    }

    public void basaEkle(int data) {
        Node yenieleman = new Node(data);
        if (elemansayisi == 0) {
            bas = yenieleman;
            son = yenieleman;
            elemansayisi++;
        } else {
            yenieleman.next = bas;
            bas = yenieleman;
            elemansayisi++;
        }
    }

    public void sonaEkle(int data) {
        if (elemansayisi == 0) {
            this.basaEkle(data);
        } else {
            Node yenieleman = new Node(data);
            son.next = yenieleman;
            son = yenieleman;
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
            while (tmp.next.data < data) {
                tmp = tmp.next;
            }
            Node yenieleman = new Node(data);
            yenieleman.next = tmp.next;
            tmp.next = yenieleman;
            elemansayisi++;
        }
    }

    public void bastanSil() {
        if (elemansayisi == 0) {
            System.out.println("Dizi Bos");
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
            System.out.println("dzi bos");
        } else if (elemansayisi == 1) {
            elemansayisi--;
            bas = null;
            son = null;
        } else {
            Node tmp = bas;
            while (tmp.next != son) {
                tmp = tmp.next;
            }
            tmp.next = null;
            son = tmp;
            elemansayisi--;
        }

    }

    public void sil(int data) {
       if(elemansayisi==0){
           System.out.println("liste bos");
       }else{
            if (bas.data == data) {
            this.bastanSil();
        } else if (son.data == data) {
            this.sondanSil();
        } else {
            Node tmp = bas;
            while (tmp.next != null && tmp.next.data != data) {
                tmp = tmp.next;
            }
            if (tmp.next == null) {
                System.out.println("Bulunamadı");
            } else {
                tmp.next = tmp.next.next;
                elemansayisi--;
            }
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
