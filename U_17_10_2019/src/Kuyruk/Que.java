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
public class Que {
    int dizi[];
    int diziboyutu;
    int count;

    public Que(int diziboyutu) {
        this.diziboyutu = diziboyutu;
        this.dizi= new int[diziboyutu];
        this.count=0;
    }
    public void push(int data){
        if(count==diziboyutu){
            System.out.println("kuyruk dolu");
        }
        else {
            dizi[count]=data;
            count++;
        }
    }
    public int  pop(){
        if(count==0){
            System.out.println("kuyruk boş");
            return 0;
        }
        else{
            int tmp=dizi[0];
            for(int i=0;i<count-1;i++){
                dizi[i]=dizi[i+1];
            }
            count--;
            return tmp;
        }
    }
    public void yazdir(){
       for(int i =0;i<count;i++){
           System.out.print(dizi[i]+"*");
       }
        System.out.println("");
    }
    
}
