/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.models.single.Referee;
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
public class Game extends CBBaseModel implements ICBModel, ICBModelDelegate,  ICBObserver{
    private int                 id;
    private String              modality;
    private Referee             referee;
    private Player              player;
    private Trainer             trainer;
    private Tournament          tournament;
    private ArrayList<Game>     listGame;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
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

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    @Override
    public void userPressInsert() {
        String query = ""
                + "insert into partido "
                + "values"
                + "(null, '"+modality+"', "+referee.getId()+", "+player.getId()+", "+trainer.getId()+", "+tournament.getId()+"    )"
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
        System.out.println("Reload data of Game");
        try {
            super.getAllITems("Select * from partido");
            ResultSet resultSet = super.getRs();
            setListGame(new ArrayList<Game>());
            while(resultSet.next()){
               Game  game = new Game();
               
               getListGame().add(game);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public ArrayList<Game> getListGame() {
        return listGame;
    }

    public void setListGame(ArrayList<Game> listGame) {
        this.listGame = listGame;
    }



}
