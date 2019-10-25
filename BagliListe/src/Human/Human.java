/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human;

import java.util.Objects;

/**
 *
 * @author uysal
 */
public class Human {
    private String ad;
    private String soyad;
    private int yas;

    public Human(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.ad);
        hash = 47 * hash + Objects.hashCode(this.soyad);
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
        final Human other = (Human) obj;
        if (this.yas != other.yas) {
            return false;
        }
        if (!Objects.equals(this.ad, other.ad)) {
            return false;
        }
        if (!Objects.equals(this.soyad, other.soyad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ad :"+this.ad +"\nSoyad :"+ this.soyad +"\nYas :"+this.yas;
    }
    
}
