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
public class Stack extends BaseClass {


    
    public Stack(int diziboyutu) {
        super(diziboyutu);
       
    }
    
    
    public String pop(){
        if(!bos()){
            String tmp=dizi[count-1];
            count--;
          //  yazdir();
            return tmp;
        }
        else{
            System.out.println("STack boş");
            return null;
        }
    }
    
}
