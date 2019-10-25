/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.Objects;

/**
 *
 * @author uysal
 */
public class Animal {
    private String tur;
    private String ad;

    public Animal(String tur, String ad) {
        this.tur = tur;
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Tür :"+this.tur + "\nAd :"+this.ad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.tur);
        hash = 71 * hash + Objects.hashCode(this.ad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.tur, other.tur)) {
            return false;
        }
        if (!Objects.equals(this.ad, other.ad)) {
            return false;
        }
        return true;
    }
    
    
}
