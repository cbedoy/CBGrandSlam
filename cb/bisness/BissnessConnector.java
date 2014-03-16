/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.bisness;

import cb.interfaces.IModel;

/**
 *
 * @author Carlos
 */
public class BissnessConnector {
    private IModel Award;
    private IModel Game;
    private IModel GrandSlam;
    private IModel Player;
    private IModel Referee;
    private IModel Trainer;

    public IModel getAward() {
        return Award;
    }

    public void setAward(IModel Award) {
        this.Award = Award;
    }

    public IModel getGame() {
        return Game;
    }

    public void setGame(IModel Game) {
        this.Game = Game;
    }

    public IModel getGrandSlam() {
        return GrandSlam;
    }

    public void setGrandSlam(IModel GrandSlam) {
        this.GrandSlam = GrandSlam;
    }

    public IModel getPlayer() {
        return Player;
    }

    public void setPlayer(IModel Player) {
        this.Player = Player;
    }

    public IModel getReferee() {
        return Referee;
    }

    public void setReferee(IModel Referee) {
        this.Referee = Referee;
    }

    public IModel getTrainer() {
        return Trainer;
    }

    public void setTrainer(IModel Trainer) {
        this.Trainer = Trainer;
    }
    
    
}
