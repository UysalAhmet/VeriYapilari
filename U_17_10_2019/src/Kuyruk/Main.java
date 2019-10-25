/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuyruk;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
      Liste cift=new Liste();
      Liste tek=new Liste();
      
       Scanner sc = new Scanner(System.in);
       int giris;
       int islem=1;
       int diziboyuu;
       int data;
        System.out.print("Kuyruk boyutunu giriniz :");
        diziboyuu=sc.nextInt();
      
        
        Que q = new Que(diziboyuu);
       do{
           
           System.out.print("1-Ekle\n2-Sil\n3-Cıkıs\nISLEM :");
           islem=sc.nextInt();
           if(islem==1){
               System.out.print("Elemanı Giriniz :");
               data=sc.nextInt();
               q.push(data);
               q.yazdir();
           }
           else if(islem==2){
               if(q.count!=0){
                   int deger=q.pop();
                   if(deger%2==0){
                       cift.Ekle(deger);
                       System.out.print("Tek -->");
                       tek.yazdir();
                       System.out.print("Cift -->");
                       cift.yazdir();
                   }
                   else{
                       tek.Ekle(deger);
                       System.out.print("Tek -->");
                       tek.yazdir();
                       System.out.print("Cift -->");
                       cift.yazdir();
                   }
               }
               else{
                   System.out.println("kuyruk bos");
               }
           }
       }while(islem!=3);
       do{
           System.out.println("1-Sil\n2-Cıkıs\nISLEM :");
           islem=sc.nextInt();
           if(islem==1){
               System.out.print("Listede silmek istediğiniz degeri giriniz :");
           data=sc.nextInt();
           tek.Sil(data);
           tek.yazdir();
           }
           else{
               System.out.println("program bitti");
           }
       }while(islem!=2);
    }
}
