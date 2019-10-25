/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiftYönlüBagliListe;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        BagliListe l= new BagliListe();
     l.add(50);
     l.add(60);
     l.add(55);
     l.add(53);
        l.print();
        l.delete(50);
        l.print();
        
    }
}
