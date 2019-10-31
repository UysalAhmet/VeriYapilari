/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSort;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String args[]) 
    { 
        int arr[] = {12, 34, 54, 2, 3}; 
        ShellSort sh= new ShellSort();
        sh.printArray(arr); 
  
        ShellSort ob = new ShellSort(); 
        ob.sort(arr); 
        
        sh.printArray(arr); 
    } 
}
