/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.bussiness.CBBaseModel;
import cb.delegates.ICBModelDelegate;
import cb.interfaces.ICBObserver;
import cb.interfaces.ICBModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
public class Trainer extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int id;
    private String name;
    private String initialDate;
    private String finalizeDate;
    private ArrayList<Trainer> listTrainer;

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

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getFinalizeDate() {
        return finalizeDate;
    }

    public void setFinalizeDate(String finalizeDate) {
        this.finalizeDate = finalizeDate;
    }

    @Override
    public void userPressInsert() {
        String query = "insert into entrenador values ("
                + "null, "
                + "'"+name+"', "
                + "'"+initialDate+"', "
                + "'"+finalizeDate+"' "
                + ")";
        System.out.println(query);
        super.insertItem(query);
    }

    @Override
    public void userPressDelete() {
        String query = "delete from entrenador where identrenador = "+id;
        super.deleteITem(query);
    }

    @Override
    public void userPressAlter() {
        
    }

    @Override
    public void userPressSearch() {
        
    }

    @Override
    public void reloadData() {
        System.out.println("Reload data of trainer");
        try {
            super.getAllITems("Select * from pais");
            ResultSet resultSet = super.getRs();
            setListTrainer(new ArrayList<Trainer>());
            while(resultSet.next()){
               Trainer  trainer = new Trainer();
               trainer.setId(resultSet.getInt(1));
               trainer.setName(resultSet.getString(2));
               trainer.setInitialDate(resultSet.getString(3));
               trainer.setFinalizeDate(resultSet.getString(4));
               getListTrainer().add(trainer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Trainer> getListTrainer() {
        return this.listTrainer;
    }

    private void setListTrainer(ArrayList<Trainer> arrayList) {
        
    }


}
