/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.models.single.Country;
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
public class Tournament extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int                     id;
    private String                  name;
    private String                  date;
    private Country                 country;
    private ArrayList<Tournament>   listTournament;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public void userPressInsert() {
        String query = ""
                + "insert into grandslam "
                + "values"
                + "(null, '"+name+"', '"+date+"', "+country.getId()+"    )"
                + "";
        super.insertItem(query);    }

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
        System.out.println("Reload data of tournament");
        try {
            super.getAllITems("Select * from grandslam");
            ResultSet resultSet = super.getRs();
            setListTournament(new ArrayList<Tournament>());
            while(resultSet.next()){
               Tournament  tournament = new Tournament();
               
               getListTournament().add(tournament);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public ArrayList<Tournament> getListTournament() {
        return listTournament;
    }

    public void setListTournament(ArrayList<Tournament> listTournament) {
        this.listTournament = listTournament;
    }


    
    
}
