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
import cb.models.single.Country;
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
public class Referee extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int id;
    private String name;
    private String nacionality;
    private String time;
    private ArrayList<Referee> listReferee;

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

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void userPressInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressAlter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressSearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reloadData() {
        System.out.println("Reload data of referee");
        try {
            super.getAllITems("Select * from pais");
            ResultSet resultSet = super.getRs();
            setListReferee(new ArrayList<Referee>());
            while(resultSet.next()){
               Referee  referee = new Referee();
               referee.setId(resultSet.getInt(1));
               referee.setName(resultSet.getString(2));
               referee.setNacionality(resultSet.getString(3));
               referee.setTime(resultSet.getString(4));
               getListReferee().add(referee);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Referee> getListReferee() {
        return listReferee;
    }

    public void setListReferee(ArrayList<Referee> listReferee) {
        this.listReferee = listReferee;
    }


}
