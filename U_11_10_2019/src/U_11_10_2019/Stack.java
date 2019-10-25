/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U_11_10_2019;

/**
 *
 * @author uysal
 */
public class Stack {
    private int dizi[];
    private int count;
    private int diziboyutu;
    private int kutle;

    public Stack(int diziboyutu) {
        this.diziboyutu = diziboyutu;
        dizi= new int[diziboyutu];
        count=0;
        kutle=0;
    }
    public void push(int sayi){
        if(count==diziboyutu){
            System.out.println("dolu");
        }
        else{
            if(sayi%2==0){
                dizi[count++]=sayi;
                kutle+=2;
            }
            else{
                dizi[count++]=sayi;
                kutle++;
            }
            
        }
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

    public int getKutle() {
        return kutle;
    }
    
    public void yazdir(){
        for(int i =0;i<count;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("   KUTLE :"+this.kutle);
    }
}
