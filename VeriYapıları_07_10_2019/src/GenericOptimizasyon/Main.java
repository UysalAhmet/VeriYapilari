/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericOptimizasyon;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        int secim = 0;
        int diziboyutu;
        String ad;
        int yas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Olusturmak İstediğiniz VeriYapısını Secin :\n1-Kuyruk\n2-Yıgıt\nIslem ::");
        secim = sc.nextInt();
        System.out.print("veriyapısının boyutunu giriniz:");
        diziboyutu=sc.nextInt();
        if (secim == 1) {
            Que<Human> que = new Que<Human>(diziboyutu);
            do {
                System.out.print("Yapmak İstediğiniz Islemi Secin :\n1-Ekle\n2-Sil\n3-Cıkıs\nIslem ::");
                secim = sc.nextInt();
                if (secim == 1) {
                    System.out.print("Insanın Adını Giriniz :");
                    ad=sc.next();
                    System.out.print("Yasını giiniz :");
                    yas=sc.nextInt();
                    Human instence = new Human(ad,yas);
                    que.push(instence);
                    que.yazdir();
                }
                if (secim == 2) {
                    que.pop();
                    que.yazdir();
                }
            } while (secim != 3);
            
        }
        else if(secim==2){
            Stack<Human> stack= new Stack<>(diziboyutu);
            do {
                System.out.print("Yapmak İstediğiniz Islemi Secin :\n1-Ekle\n2-Sil\n3-Cıkıs\nIslem ::");
                secim = sc.nextInt();
                if (secim == 1) {
                     System.out.print("Insanın Adını Giriniz :");
                    ad=sc.next();
                    System.out.print("Yasını giiniz :");
                    yas=sc.nextInt();
                    Human instence = new Human(ad,yas);
                    stack.push(instence);
                    stack.yazdir();
                }
                if (secim == 2) {
                    stack.pop();
                    stack.yazdir();
                }
            } while (secim != 3);
            
        }

    }

}
