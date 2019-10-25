/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericOptimizasyon;

import GenericQueStack.*;

/**
 *
 * @author uysal
 */
public class Human {
    public String ad;
    int yas;

    public Human(String ad,int yas) {
        this.ad = ad;
        this.yas=yas;
    }

    @Override
    public String toString() {
        return "ad :"+this.ad+" yas :"+this.yas;
    }
    
}
