/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uysal
 */
public class Baglanma {
    public Connection connect(){
        Connection c=null;
        
        try{
           Class.forName("org.postgresql.Driver").newInstance();
           c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental?user=postgres&password=1453");
            System.out.println("Düzgün Şekilde Bağlandi");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        }
        
        return c;
    }
}
