/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U_11_10_2019;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diziboyutu;
        int islem;
        System.out.print("diziboyutunu giriniz :");
        diziboyutu = sc.nextInt();
        Stack s1 = new Stack(diziboyutu);
        Stack s2 = new Stack(diziboyutu);
int sayi;
        do {
            System.out.print("1-Ekle\n2-Cikis\nISLEM");
            islem = sc.nextInt();
            if(islem==1){
                System.out.print("Sayiyi Giriniz :");
                sayi = sc.nextInt();
                if(s1.getKutle()==s2.getKutle()){
                    s1.push(sayi);
                }
                else if(s1.getKutle()>s2.getKutle()){
                    s2.push(sayi);
                }
                else if(s1.getKutle()<s2.getKutle()){
                    s1.push(sayi);
                }
                s1.yazdir();
                s2.yazdir();
            }
        } while (islem != 3);

    }

}
