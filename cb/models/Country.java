/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.bussiness.BaseModel;
import cb.delegates.IModelDelegate;
import cb.interfaces.IModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Country extends BaseModel implements IModel, IModelDelegate{
    private int id;
    private String name;
    private ArrayList<Country> listCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void userPressInsert() {
        String query = ""
                + "insert into pais "
                + "values"
                + "(null, '"+name+"')"
                + "";
        super.insertItem(query);
    }

    @Override
    public void userPressDelete() {
        
    }

    @Override
    public void userPressAlter() {
        
    }

    @Override
    public void userPressSearch() {
        
    }

    @Override
    public void reloadData() {
        try {
            super.getAllITems("Select * from pais");
            ResultSet resultSet = super.getRs();
            setListCountry(new ArrayList<Country>());
            while(resultSet.next()){
               Country  country = new Country();
               country.setId(resultSet.getInt(1));
               country.setName(resultSet.getString(2));
               getListCountry().add(country);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

    public ArrayList<Country> getListCountry() {
        return listCountry;
    }

    public void setListCountry(ArrayList<Country> listCountry) {
        this.listCountry = listCountry;
    }
    
    private boolean getStatus(){
        return super.isStatus();
    }
}
