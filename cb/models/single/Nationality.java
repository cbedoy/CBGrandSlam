/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models.single;

import cb.bussiness.CBBaseModel;
import cb.delegates.ICBModelDelegate;
import cb.interfaces.ICBObserver;
import cb.interfaces.ICBModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

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
public class Nationality extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int                     id;
    private String                  name;
    private ArrayList<Nationality>  listNationality;
    

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
                + "insert into nacionalidad "
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
        System.out.println("Reload data of nationality");
        try {
            super.getAllITems("Select * from nacionalidad");
            ResultSet resultSet = super.getRs();
            setListNationality(new ArrayList<Nationality>());
            while(resultSet.next()){
               Nationality  nationality = new Nationality();
               nationality.setId(resultSet.getInt(1));
               nationality.setName(resultSet.getString(2));
               getListNationality().add(nationality);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Nationality> getListNationality() {
        return listNationality;
    }

    public void setListNationality(ArrayList<Nationality> listNationality) {
        this.listNationality = listNationality;
    }


}
