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
public class Main {
    public static void main(String[] args) {
        int []a ={10,5,4,12,2,11};
        MergeS m= new MergeS();
        m.sort(a, 0, a.length-1);
       // m.yazdir(a);
    }
}
