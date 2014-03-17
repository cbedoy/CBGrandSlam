/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.abstracts.BaseModel;
import cb.interfaces.IModel;

/**
 *
 * @author Carlos
 */
public class Game extends BaseModel implements IModel{
    private int id;
    private String modality;
    private Referee referee;
    private Player player;
    private Trainer trainer;
    private GrandSlam grandSlam;

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

    public GrandSlam getGrandSlam() {
        return grandSlam;
    }

    public void setGrandSlam(GrandSlam grandSlam) {
        this.grandSlam = grandSlam;
    }
}
