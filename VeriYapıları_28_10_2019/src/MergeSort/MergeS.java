/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;

/**
 *
 * @author uysal
 */
public class MergeS {

    int[] dizi;

    public void merge(int[] dizi, int sol, int orta, int sag) {
        int soldiziboyut = orta - sol + 1;
        int sagdiziboyut = sag - orta;
        int SOL[] = new int[soldiziboyut];
        int SAG[] = new int[sagdiziboyut];

        for (int i = 0; i < soldiziboyut; ++i) {
            SOL[i] = dizi[sol + i];
        }
        for (int j = 0; j < sagdiziboyut; ++j) {
            SAG[j] = dizi[orta + 1 + j];
        }
        int i = 0, j = 0;
        int k = sol;
        while (i < soldiziboyut && j < sagdiziboyut) {
            if (SOL[i] <= SAG[j]) {
                dizi[k] = SOL[i];
                i++;
            } else {
                dizi[k] = SAG[j];
                j++;
            }
            k++;
        }
        while (i < soldiziboyut) {
            dizi[k] = SOL[i];
            i++;
            k++;
        }
        while (j < sagdiziboyut) {
            dizi[k] = SAG[j];
            j++;
            k++;
        }
        for (int a : dizi) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    public void sort(int dizi[], int sol, int sag) {
        if (sol < sag) {
            int orta = (sol + sag) / 2;
            sort(dizi, sol, orta);
            sort(dizi, orta + 1, sag);
            merge(dizi, sol, orta, sag);
        }
    }

    public void yazdir(int[] dizi) {
        for (int a : dizi) {
            System.out.print(a + " ");
        }
        System.out.println("");

    }
}
