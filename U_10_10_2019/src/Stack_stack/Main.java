package Stack_stack;

import java.util.Scanner;

public class Main {

    public void init() {
        Que q1 = new Que(4);
        Que q2 = new Que(4);
        Stack s1 = new Stack(4);
        Scanner giris = new Scanner(System.in);
        int secim, sayi;
        do {
            System.out.print("1-Ekle\n2-sil\n3-Cikis\nIslem :");
            secim = giris.nextInt();
            if (secim == 1) {
                if (!(q1.getCount() == q1.getDiziboyutu())) {
                    System.out.print("Eklenecek Elemanı Giriniz :");
                    sayi = giris.nextInt();
                    q1.push(sayi);
                } else {
                    if (!(s1.getCount() == s1.getDiziboyutu())) {
                        System.out.print("Eklenecek Elemanı Giriniz :");
                        sayi = giris.nextInt();
                        s1.push(q1.pop());
                        q1.push(sayi);
                    } else {
                        if (q2.getCount() == q2.getDiziboyutu()) {
                            System.out.println("Hepsi Dolu");
                        } else {
                            System.out.print("Eklenecek Elemanı Giriniz :");
                            sayi = giris.nextInt();
                            q2.push(sayi);
                        }
                    }
                }
                q1.yazdir();
                s1.yazdir();
                q2.yazdir();
            } else if (secim == 2) {
                System.out.println("henüz yapılmadı");
            } else {
                System.out.println("Cikiliyor ..");
            }
        } while (secim != 3);

    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.init();
    }

}
