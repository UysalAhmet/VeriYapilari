/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_stack;

/**
 *
 * @author uysal
 */
public class Que {
   private int dizi[];
   private int diziboyutu;
   private int count;
   public Que(int diziboyutu){
       this.diziboyutu=diziboyutu;
       this.dizi=new int[diziboyutu];
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
           System.out.println("Kuyruk bos");
           return 0;
       }
       else{
           int tmp =dizi[0];
           for(int i=0;i<count-1;i++){
               dizi[i]=dizi[i+1];
               
               
           }
           count--;
           return tmp;
       }
   }
   public void yazdir(){
        for(int i =0;i<count;i++){
            System.out.print(dizi[i]+" ");
        }
         System.out.println("");
    }

    public int[] getDizi() {
        return dizi;
    }

    public int getCount() {
        return count;
    }

    public int getDiziboyutu() {
        return diziboyutu;
    }
    
    
}
