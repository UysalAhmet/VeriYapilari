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
public class RadixSort {
     
     int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
     void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; 
        int i; 
        int count[] = new int[10]; 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 

        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
    public void radixsort(int arr[], int n) 
    { 
        int m = getMax(arr, n); 
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
     public void print(int arr[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
  
  
}

