package cb.connectors;

import cb.interfaces.IModel;
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

public class ModelConnector{
    private IModel Award;
    private IModel Country;
    private IModel Game;
    private IModel Location;
    private IModel Nationality;
    private IModel Player;
    private IModel Referee;
    private IModel Tournament;
    private IModel Trainer;
    private IModel ConectionDB;

    public IModel getAward() {
        return Award;
    }

    public void setAward(IModel Award) {
        this.Award = Award;
    }

    public IModel getCountry() {
        return Country;
    }

    public void setCountry(IModel Country) {
        this.Country = Country;
    }

    public IModel getGame() {
        return Game;
    }

    public void setGame(IModel Game) {
        this.Game = Game;
    }

    public IModel getLocation() {
        return Location;
    }

    public void setLocation(IModel Location) {
        this.Location = Location;
    }

    public IModel getNationality() {
        return Nationality;
    }

    public void setNationality(IModel Nationality) {
        this.Nationality = Nationality;
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

    public IModel getTournament() {
        return Tournament;
    }

    public void setTournament(IModel Tournament) {
        this.Tournament = Tournament;
    }

    public IModel getTrainer() {
        return Trainer;
    }

    public void setTrainer(IModel Trainer) {
        this.Trainer = Trainer;
    }

    public IModel getConectionDB() {
        return ConectionDB;
    }

    public void setConectionDB(IModel ConectionDB) {
        this.ConectionDB = ConectionDB;
    }
}
