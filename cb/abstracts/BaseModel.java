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

/**
 *
 * @author Carlos
 */
public abstract class BaseModel implements IModel, IBissness{

    private  ConectionDB connection;
    private  ResultSet   rs;
    private  boolean     status;
    
    public BaseModel(){
        connection =  new ConectionDB();
    }
    
 
    @Override
    public void getAllITems(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertItem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteITem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void editITem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void getITem(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ConectionDB getConnection() {
        return connection;
    }

    public void setConnection(ConectionDB connection) {
        this.connection = connection;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
