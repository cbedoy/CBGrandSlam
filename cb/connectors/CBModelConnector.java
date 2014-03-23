package cb.connectors;

import cb.interfaces.ICBModel;
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
 * 22-mar-2014 - 11:12:37
 */

public class CBModelConnector{
    private ICBModel Award;
    private ICBModel Country;
    private ICBModel Game;
    private ICBModel Location;
    private ICBModel Nationality;
    private ICBModel Player;
    private ICBModel Referee;
    private ICBModel Tournament;
    private ICBModel Trainer;
    private ICBModel ConectionDB;

    public ICBModel getAward() {
        return Award;
    }

    public void setAward(ICBModel Award) {
        this.Award = Award;
    }

    public ICBModel getCountry() {
        return Country;
    }

    public void setCountry(ICBModel Country) {
        this.Country = Country;
    }

    public ICBModel getGame() {
        return Game;
    }

    public void setGame(ICBModel Game) {
        this.Game = Game;
    }

    public ICBModel getLocation() {
        return Location;
    }

    public void setLocation(ICBModel Location) {
        this.Location = Location;
    }

    public ICBModel getNationality() {
        return Nationality;
    }

    public void setNationality(ICBModel Nationality) {
        this.Nationality = Nationality;
    }

    public ICBModel getPlayer() {
        return Player;
    }

    public void setPlayer(ICBModel Player) {
        this.Player = Player;
    }

    public ICBModel getReferee() {
        return Referee;
    }

    public void setReferee(ICBModel Referee) {
        this.Referee = Referee;
    }

    public ICBModel getTournament() {
        return Tournament;
    }

    public void setTournament(ICBModel Tournament) {
        this.Tournament = Tournament;
    }

    public ICBModel getTrainer() {
        return Trainer;
    }

    public void setTrainer(ICBModel Trainer) {
        this.Trainer = Trainer;
    }

    public ICBModel getConectionDB() {
        return ConectionDB;
    }

    public void setConectionDB(ICBModel ConectionDB) {
        this.ConectionDB = ConectionDB;
    }
}
