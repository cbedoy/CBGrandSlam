/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.models.single.Trainer;
import cb.models.single.Nationality;
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
public class Player extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int                     id;
    private String                  name;
    private int                     age;
    private float                   amount;
    private Trainer                 trainer;
    private Nationality             nationality;
    private ArrayList<Player>       listPlayer;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    @Override
    public void userPressInsert() {
        String query = ""
                + "insert into jugador "
                + "values"
                + "(null, '"+name+"', "+age+", "+amount+", "+trainer.getId()+", "+nationality.getId()+"    )"
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
        System.out.println("Reload data of player");
        try {
            super.getAllITems("Select * from jugador");
            ResultSet resultSet = super.getRs();
            setListPlayer(new ArrayList<Player>());
            while(resultSet.next()){
               Player  player = new Player();
               
               getListPlayer().add(player);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public ArrayList<Player> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }





   
    
}
