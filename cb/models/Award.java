/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.bussinessTest.BaseModel;
import cb.interfaces.IModel;

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
public class Award extends BaseModel implements IModel{
    private int id;
    private float amount;
    private float category;
    private Tournament grandSlam;
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
}
