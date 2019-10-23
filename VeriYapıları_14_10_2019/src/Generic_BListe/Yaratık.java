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
public class Yaratık {
    String tür;
    int boy;

    public Yaratık(String tür, int boy) {
        this.tür = tür;
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "tür : "+tür +"  boy :"+boy;
    }
        
}
