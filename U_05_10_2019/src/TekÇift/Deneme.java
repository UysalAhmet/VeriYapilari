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
public class Deneme {
    int dizi[];
    
    public Deneme(int dizi[]){
        this.dizi=dizi;
    }
    public void bubblesort(){
        for(int i =dizi.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(dizi[j]<dizi[j+1]){
                    int tmp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=tmp;
                    
                }
            }
        }
        yazdir();
    }
    
    public void Insertionsort(){
        for(int i =1;i<dizi.length;i++){
            int tmp=i;
            int sayi=dizi[tmp];
            for(int j=(i-1);j>=0;j--){
                if(dizi[j]<sayi){
                    dizi[tmp]=dizi[j];
                    tmp--;
                }
            }
            dizi[tmp]=sayi;
        }
        yazdir();
    }
    public void selectionsort(){
        for(int i =0;i<dizi.length;i++){
            int max=i;
            for(int j=i+1;j<dizi.length;j++){
                if(dizi[max]<dizi[j]){
                    max=j;
                }
            }
            int tmp=dizi[i];
            dizi[i]=dizi[max];
            dizi[max]=tmp;
        }
        yazdir();
    }
    
    public void yazdir(){
        for(int a :dizi){
            System.out.print(a+"-");
        }
    }
    public static void main(String[] args) {
      int dizi[]={5,7,1,9,3};
      Deneme s = new Deneme(dizi);
      //s.bubblesort();
     // s.Insertionsort();
     s.selectionsort();
}
}