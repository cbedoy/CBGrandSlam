/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.connectors;

import cb.bussiness.ModelObserver;
import cb.interfaces.ICBArtifact;
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
public class ViewConnector extends Observable{
    private ICBArtifact AwardView;
    private ICBArtifact CountryView;
    private ICBArtifact GameView;
    private ICBArtifact LocationView;
    private ICBArtifact NationalityView;
    private ICBArtifact PlayerView;
    private ICBArtifact RefereeView;
    private ICBArtifact TournamentView;
    private ICBArtifact TrainerView;

    public ICBArtifact getAwardView() {
        return AwardView;
    }

    public void setAwardView(ICBArtifact AwardView) {
        this.AwardView = AwardView;
    }

    public ICBArtifact getCountryView() {
        return CountryView;
    }

    public void setCountryView(ICBArtifact CountryView) {
        this.CountryView = CountryView;
    }

    public ICBArtifact getGameView() {
        return GameView;
    }

    public void setGameView(ICBArtifact GameView) {
        this.GameView = GameView;
    }

    public ICBArtifact getLocationView() {
        return LocationView;
    }

    public void setLocationView(ICBArtifact LocationView) {
        this.LocationView = LocationView;
    }

    public ICBArtifact getNationalityView() {
        return NationalityView;
    }

    public void setNationalityView(ICBArtifact NationalityView) {
        this.NationalityView = NationalityView;
    }

    public ICBArtifact getPlayerView() {
        return PlayerView;
    }

    public void setPlayerView(ICBArtifact PlayerView) {
        this.PlayerView = PlayerView;
    }

    public ICBArtifact getRefereeView() {
        return RefereeView;
    }

    public void setRefereeView(ICBArtifact RefereeView) {
        this.RefereeView = RefereeView;
    }

    public ICBArtifact getTournamentView() {
        return TournamentView;
    }

    public void setTournamentView(ICBArtifact TournamentView) {
        this.TournamentView = TournamentView;
    }

    public ICBArtifact getTrainerView() {
        return TrainerView;
    }

    public void setTrainerView(ICBArtifact TrainerView) {
        this.TrainerView = TrainerView;
    }


}
