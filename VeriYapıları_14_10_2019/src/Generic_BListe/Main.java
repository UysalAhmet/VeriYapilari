/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic_BListe;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        Bliste liste = new Bliste();
       
        Human  a= new Human("ali",22);
        liste.addToHead(a);
        liste.addToHead(new Human("veli",22));
        liste.addToTail(new Human("nuruş",42));
        liste.add(new Human ("mustafa",22));
        liste.print();
        liste.add(new Yaratık("nurullah",180));
        liste.print();
    }
}
