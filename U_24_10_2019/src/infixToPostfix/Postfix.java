/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixToPostfix;

/**
 *
 * @author uysal
 */
public class Postfix {

    public String dizgi;
    public String postfix;
    public Stack s1;
    public int diziboyutu;

    public Postfix(String dizgi) {
        this.dizgi = dizgi;
        this.diziboyutu = dizgi.length();
        this.s1 = new Stack(diziboyutu);
        this.postfix = "";
    }

    public String postfix() {
        String a = "";
        for (int i = 0; i < dizgi.length(); i++) {
            if (dizgi.charAt(i) == '(') {

                int begin = i;
                while (dizgi.charAt(i) != ')') {
                    i++;
                }
                int last = i;
                a += parantez(begin, last);

            } else if (dizgi.charAt(i) >= 97 && dizgi.charAt(i) <= 122) {
                a += dizgi.charAt(i);
            } else if (dizgi.charAt(i) == '+' || dizgi.charAt(i) == '-') {

                if (s1.getCount() == 1) {
                    a += (char) s1.pop();
                    s1.push(dizgi.charAt(i));
                } else {
                    s1.push(dizgi.charAt(i));
                }

            } else if (s1.getCount() != 0 && (s1.getDizi(s1.getCount() ) == '+' || s1.getDizi(s1.getCount() ) == '-' && dizgi.charAt(i) == '*' || dizgi.charAt(i) == '/')) {
                a += dizgi.charAt(i);

            } else if (dizgi.charAt(i) == '*' || dizgi.charAt(i) == '/') {
                s1.push(dizgi.charAt(i));
            }

        }
        for (int i = 0; i <= s1.getCount(); i++) {
            System.out.println("YIGIT -->"+(char)s1.getDizi(s1.getCount()-1));
            a += (char) s1.pop();
        }

        return a;
    }

    public String parantez(int begin, int last) {
        String b = "";
        Stack s2 = new Stack(diziboyutu);
        for (int i = begin; i <= last; i++) {

            if (dizgi.charAt(i) >= 97 && dizgi.charAt(i) <= 122) {
                b += dizgi.charAt(i);
            } else if (dizgi.charAt(i) == '+' || dizgi.charAt(i) == '-') {
                s2.push(dizgi.charAt(i));

            } else if (s2.getCount() != 0 && (s1.getDizi(s2.getCount() - 1) == '+' || s2.getDizi(s2.getCount() - 1) == '-' && dizgi.charAt(i) == '*' || dizgi.charAt(i) == '/')) {
                b += dizgi.charAt(i);

            }

        }
        for (int i = 0; i < s2.getCount(); i++) {
             System.out.println("YIGIT -->"+(char)s2.getDizi(s2.getCount()-1));
            b += (char) s2.pop();
        }

        return b;
    }

}
