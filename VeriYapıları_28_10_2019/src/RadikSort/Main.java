/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadikSort;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        RadixSort rs=new RadixSort();
        int n = arr.length; 
        rs.radixsort(arr, n); 
        rs.print(arr, n); 
    }
}
