/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueStack;

/**
 *
 * @author uysal
 */
public class Que extends BaseClass{
 
    public Que(int diziboyutu){
        super(diziboyutu);
    }
 
    public String pop(){
        if(!bos()){
            String tmp=dizi[0];
            for(int i=0;i<count-1;i++){
                dizi[i]=dizi[i+1];
            }
            count--;
            return tmp;
        }
        else{
            System.out.println("Kuyruk Boş");
            
            return null;
        }
    }
    
    
    
}
