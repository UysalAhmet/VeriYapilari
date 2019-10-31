/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author uysal
 */
public class QuickSort {

    int parcala(int dizi[], int low, int high) {
        int pivot = dizi[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (dizi[j] < pivot) {
                i++;

                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }

        int temp = dizi[i + 1];
        dizi[i + 1] = dizi[high];
        dizi[high] = temp;

        return i + 1;
    }

    void sort(int dizi[], int low, int high) {
        if (low < high) {
            int pi = parcala(dizi, low, high);

            sort(dizi, low, pi - 1);
            sort(dizi, pi + 1, high);
        }
    }
    public void yazdir(int[]dizi){
        for(int a :dizi){
            
            System.out.print(a+"-");
        }
        System.out.println("");
    }
}
