/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.business;

import cb.interfaces.IModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * Carlos Alfredo Cervantes Bedoy
 * Mobile Developer
 * CBGrandSlam
 * Email:           carlos.bedoy@gmail.com
 * Facebook:        https://www.facebook.com/carlos.bedoy
 * Github:          https://github.com/cbedoy
 * WebSite:         http://cbedoy.github.io/
 *
 * 17-mar-2014 - 22:22:34
 */

public class ConectionDB implements IModel {
    private Connection ct;
    private Statement st;  
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String db = "jdbc:mysql://localhost:3306/codice";
    private String message;
    private boolean conectado;
    
    
    public ConectionDB(){
        try{
            Class.forName(driver).newInstance();
            ct = DriverManager.getConnection(db, "root", "");
            st = ct.createStatement();
            conectado = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            message = e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public boolean getConectado(){
        return this.conectado;
    }
    public String getMessage(){
        return this.message;
    }
    
    public Statement getSt(){
        return st;
    }
    
    public void closeConnection(){
        try {
            ct.close();
        } catch (SQLException ex) { 
        }
        
    }
    
    
    
}