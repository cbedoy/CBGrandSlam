/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.abstracts;

import cb.bisness.ConectionDB;
import cb.interfaces.IBissness;
import cb.interfaces.IModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public abstract class BaseModel implements IModel, IBissness{

    private  final       ConectionDB connection;
    private  ResultSet   rs;
    private  boolean     status;
    
    public BaseModel(){
        connection =  new ConectionDB();
    }
    
 
    @Override
    public void getAllITems(String query) {
        try {
            this.rs  = connection.getSt().executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertItem(String query) {
        try {
            this.status = connection.getSt().execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteITem(String query) {
        try {
            this.status = connection.getSt().execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void editITem(String query) {
        try {
            this.status = connection.getSt().execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void getITem(String query) {
        try {
            this.rs  = connection.getSt().executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
