/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT;

/**
 *
 * @author uysal
 */
public class Main {
    public static void main(String[] args) {
        Liste l = new Liste();
      l.Ekle(50);
      l.Ekle(60);
      l.Ekle(70);
      l.Ekle(65);
      l.sil(60);
      l.sil(50);
      l.yazdir();
      l.sil(70);
      l.sil(65);
      l.sil(65);
      
      
       l.yazdir();
     
    }
}
