/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TekÇift;

/**
 *
 * @author uysal
 */
public class TerstenYazdir {
    String ad;
    public TerstenYazdir(String ad){
        this.ad = ad;
    }
    public  void terstenyaz(){
        for(int i =ad.length()-1;i>=0;i--){
            System.out.print(ad.charAt(i)+"");
        }
    }
    
    public static void main(String[] args) {
       String  ad="temha";
        
        TerstenYazdir a = new TerstenYazdir(ad);
        a.terstenyaz();
    }
}
