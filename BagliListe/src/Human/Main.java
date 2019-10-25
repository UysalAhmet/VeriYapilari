/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human;

/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        liste.Ekle(new Node(new Human("Ahmet", "Uysal", 22)));
        liste.Ekle(new Node(new Human("Süleyman", "Can", 21)));
        liste.Ekle(new Node(new Human("Mustafa", "Hangun", 40)));
        liste.Ekle(new Node(new Human("Mustafa", "Bıldırcın", 39)));
        liste.yazdir();
        liste.Sil(new Node(new Human("Ahmet", "Uysal", 22)));
        System.out.println("/////////////////////////");
        liste.yazdir();

    }
}
