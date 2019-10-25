/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;


/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        BagliListe<Human> liste = new BagliListe<>();
        liste.Ekle(new Node(new Human("Ahmet", "Uysal", 22)));
        liste.Ekle(new Node(new Human("Süleyman", "Can", 21)));
        liste.Ekle(new Node(new Human("Mustafa", "Hangun", 40)));
        liste.Ekle(new Node(new Human("Mustafa", "Bıldırcın", 39)));
        liste.yazdir();
        liste.Sil(new Node(new Human("Ahmet", "Uysal", 22)));
        System.out.println("/////////////////////////");
        liste.yazdir();
        liste.Ekle(new Node(new Animal("Köpek", "karabas")));
        System.out.println("/////////////////////////");
        liste.yazdir();
    }
}
