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
public class Human {
    private String name;
    private int yas;

    public Human(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "AD :"+this.name+"  YAS : "+this.yas;
                }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash = 97 * hash + this.yas;
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
        return true;
    }
    
    
}
