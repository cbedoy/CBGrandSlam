/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.models.single.Trainer;
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
public class Award extends CBBaseModel implements ICBModel, ICBModelDelegate, ICBObserver{
    private int                 id;
    private float               amount;
    private String              category;
    private Tournament          grandSlam;
    private Player              player;
    private Trainer             trainer;
    private ArrayList<Award>    listAward;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Tournament getGrandSlam() {
        return grandSlam;
    }

    public void setGrandSlam(Tournament grandSlam) {
        this.grandSlam = grandSlam;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public void userPressInsert() {
        String query = ""
                + "insert into premio "
                + "values"
                + "(null, "+amount+", '"+category+"', "+grandSlam.getId()+", "+player.getId()+", "+trainer.getId()+"    )"
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
        System.out.println("Reload data of AwardView");
        try {
            super.getAllITems("Select * from premio");
            ResultSet resultSet = super.getRs();
            setListAward(new ArrayList<Award>());
            while(resultSet.next()){
               Award  award = new Award();
               
               getListAward().add(award);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public ArrayList<Award> getListAward() {
        return listAward;
    }

    public void setListAward(ArrayList<Award> listAward) {
        this.listAward = listAward;
    }

}
