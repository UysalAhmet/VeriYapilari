/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericQueStack;

/**
 *
 * @author uysal
 */
public class Que<T> extends BaseClass<T>{

    public Que(Class<T> c,int diziboyutu) {
        super(c,diziboyutu);
    }
    public T pop(){
        if(count==0){
            System.out.println("kuyruk bos");
            return null;
        }
        else{
            T tmp = dizi[0];
            for(int i =0;i<count-1;i++){
                dizi[i]=dizi[i+1];
            }
            count--;
            return tmp;
        }
    }
    
}
