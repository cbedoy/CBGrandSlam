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
public class Award extends BaseModel implements IModel{
    private int id;
    private float amount;
    private float category;
    private GrandSlam grandSlam;
    private Player player;
    private Trainer trainer;
    

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

    public float getCategory() {
        return category;
    }

    public void setCategory(float category) {
        this.category = category;
    }

    public GrandSlam getGrandSlam() {
        return grandSlam;
    }

    public void setGrandSlam(GrandSlam grandSlam) {
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
}
