package CountingSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uysal
 */
public class CountingSort {

    int[] dizi;
    int max;
    int k = 0;

    public CountingSort(int[] dizi) {
        this.dizi = dizi;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[max] < dizi[i]) {
                max = i;
            }
        }
        this.max = dizi[max];
    }

    public void countingSort() {
        int[] tmp = new int[max + 1];
        int[] out = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            ++tmp[dizi[i]];
        }
        for (int i = 0, j = 0; i < tmp.length && j <= tmp[i]; j++) {
            if (tmp[i] != 0) {
                out[k] = i;
                if (j + 1 == tmp[i]) {
                    if (i + 1 < tmp.length && tmp[i + 1] == 0) {
                        i += 2;
                        j = -1;
                    } else {
                        i++;
                        j = -1;
                    }

                }
                k++;
            } else {
                i++;
                j = -1;
            }

        }
        for (int a : out) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}
