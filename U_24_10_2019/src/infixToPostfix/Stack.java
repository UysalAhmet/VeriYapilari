/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixToPostfix;

/**
 *
 * @author uysal
 */
public class Stack {
    private int dizi[];
    private int count;
    private int diziboyutu;

    public Stack(int diziboyutu) {
        this.diziboyutu=diziboyutu;
        this.dizi = new int[diziboyutu];
        count=0;
    }
    
    public void push(int sayi){
        if(count==dizi.length){
            System.out.println("Stack dolu");
        }
        else{
            dizi[count]=sayi;
            count++;
        }
    }
    public int pop(){
        if(count==0){
            System.out.println("Stack Bos");
                    return 0;
        }
        else{
            return dizi[--count];
        }
    }
    public void yazdir(){
        for(int i =0;i<count;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
    }

    public int getDizi(int index) {
        return dizi[index];
    }

    public int getCount() {
        return count;
    }

    public int getDiziboyutu() {
        return diziboyutu;
    }
    
    
    
}
