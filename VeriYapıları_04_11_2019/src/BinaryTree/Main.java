/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author uysal
 */
public class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(); t.add(new Node(25));
        t.add(new Node(15));
        t.add(new Node(17));
        t.add(new Node(16));
        t.add(new Node(18));
        t.add(new Node(10));
        t.add(new Node(13));
        t.add(new Node(11));
        t.add(new Node(14));
        t.add(new Node(30));
        t.add(new Node(27));
        t.add(new Node(35));
        t.add(new Node(31));
        t.add(new Node(34));
        t.add(new Node(33));
        t.add(new Node(12));
        
      //  System.out.println(t.search(new Node()) != null ? "var" : "yok");
        t.delete(new Node(11));

      //  System.out.println(t.search(new Node()) != null ? "var" : "yok");
        
        
        t.traversePreOrder(t.getRoot());
        System.out.println("");
        t.traverseInOrder(t.getRoot());

        System.out.println("");
        t.traversePostOrder(t.getRoot());
    }

}
