/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merge;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dizi;
        do {
            System.out.print("Bir karakter dizisi giriniz :");
            dizi = sc.nextLine();
            Merge a = new Merge(dizi);
            a.sort(0, dizi.length()-1);
        }while(true);
        
    
    }
}
