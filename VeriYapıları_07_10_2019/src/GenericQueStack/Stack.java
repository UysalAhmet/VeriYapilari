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
public class Stack<T> extends BaseClass<T> {

    
    public Stack(Class<T> c, int diziboyutu) {
        super(c, diziboyutu);
    }
    public T pop(){
        if(count==0){
            System.out.println("kuyruk bos");
            return null;
        }
        else{
            return dizi[--count];
        }
    }
    
}
