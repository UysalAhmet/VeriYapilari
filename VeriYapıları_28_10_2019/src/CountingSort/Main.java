/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountingSort;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        int []dizi={5,5,5,7,4,1,4,7,3,3,2,9,8,0,0};
        int []dizi2={0,8,7,6,5,4,3,2,1,100,24,58,74,14,32,2,9,84,0,4,2,0,0,1,1,0};
        //0,0,1,2,3,3,4,4,5,5,5,7,7,8,9
        CountingSort c = new CountingSort(dizi2);
        c.countingSort();
    }
}
