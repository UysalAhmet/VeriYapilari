/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author uysal
 */
public class Stack {
    int dizi[];
    int count;
    int diziboyutu;
    
    public Stack(int diziboyutu){
        this.diziboyutu=diziboyutu;
        this.dizi= new int[diziboyutu];
        count=0;
    }
    public void push(int sayi){
        if(count==diziboyutu){
            
        }
        else{
            dizi[count++]=sayi;
        }
    }
    
}
