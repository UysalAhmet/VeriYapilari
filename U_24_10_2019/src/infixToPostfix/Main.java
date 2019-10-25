/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixToPostfix;

import java.util.Scanner;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İslemi Giriniz :");
        String islem =sc.nextLine();
        Postfix a = new Postfix(islem);//((a+b)/((d-c)*f))
        System.out.println("SONUC --> "+a.postfix());
    }
}
