/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericQueStack;

import java.lang.reflect.Array;

/**
 *
 * @author uysal
 */
public  abstract class BaseClass<T> {
    
    protected T[] dizi;
    protected int count;
    protected Class<T> entity;

    public BaseClass(Class<T> c,int diziboyutu) {
        this.entity = c;
        this.dizi =(T[]) Array.newInstance(entity, diziboyutu);
    }

    public void push(T instence){
        if(count==dizi.length){
            System.out.println("dizi dolu");
        }
        else{
            dizi[count]=instence;
            count++;
        }
    }
    
    public void yazdir(){
        for(int i =0;i<count;i++){
            System.out.println(dizi[i]);
        }
        System.out.println("/////////////////");
    }
    
    
    
    
}
