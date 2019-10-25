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
public class BaseClass {
    
    protected String dizi[];

    protected int count;
    
    public BaseClass(int diziboyutu){
        dizi= new String[diziboyutu];
        count=0;
        
    }
    
    public boolean dolu(){
        if(count==dizi.length){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean bos(){
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(String a){
        if(!dolu()){
            dizi[count]=a;
            count++;
         //   yazdir();
        }
        else{
            System.out.println("stack dolu");
        }
    }
    
    public void yazdir(){
        for(int i=0;i<count;i++){
            System.out.print(dizi[i]+"-");
        }
        System.out.println("");
    }
    
}
