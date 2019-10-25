/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueStack;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {
    
    
    public static void menu(){
        System.out.print("1-Ekle\n2-Sil\n3-Cıkıs\nIslem :");   
    }
    public static void main(String[] args) {
        
        Stack s = new Stack(10);
       s.push("a");
       s.yazdir();
       s.push("b");
       s.yazdir();
       s.push("c");
       s.yazdir();
       s.push("d");
       s.yazdir();
       s.pop();
       s.yazdir();
       s.pop();
       s.yazdir();
        
        
    }
    
}
