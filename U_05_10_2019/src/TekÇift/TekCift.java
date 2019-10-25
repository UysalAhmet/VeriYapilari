/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TekÇift;

import java.util.Scanner;

public class TekCift {

    int dizi[];
    int tmp;
    
    public TekCift(String ad){
        
        this.dizi= new int [ad.length()/2+1];
        
        this.tmp=ad.length();
    }
    
    public int[] tekCift(){
        
        if(tmp%2==0){
            for(int i =0;i<dizi.length;){
                if(tmp%2==0){
                    dizi[i]=tmp;
                    i++;
                }
                tmp--;
            }
        }
        else{
            for(int i =0;i<dizi.length;){
                if(tmp%2!=0){
                    dizi[i]=tmp;
                    i++;
                }
                tmp--;
            }
        }
        return dizi;
    }
    public static void main(String[] args) {
        int dizi[];
        String ad;
        Scanner sc = new Scanner(System.in);
        System.out.println("bir isim giriniz :");
        ad= sc.nextLine();
        TekCift s = new TekCift(ad);
        dizi=s.tekCift();
        for( int a :dizi){
            System.out.print(a+"-");
        }
        
    }
}
