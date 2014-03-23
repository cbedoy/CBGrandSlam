/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.connectors;

import cb.bussiness.ModelObserver;
import cb.interfaces.IArtifact;
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
    private IArtifact AwardView;
    private IArtifact CountryView;
    private IArtifact GameView;
    private IArtifact TournamentView;
    private IArtifact LocationView;
    private IArtifact NationalityView;
    private IArtifact PlayerView;
    private IArtifact RefereeView;
    private IArtifact TrainerView;
    
    
    
    public IArtifact getAwardView() {
        return AwardView;
    }

    public void setAwardView(IArtifact AwardView) {
        this.AwardView = AwardView;
    }

    public IArtifact getCountryView() {
        return CountryView;
    }

    public void setCountryView(IArtifact CountryView) {
        this.CountryView = CountryView;
    }

    public IArtifact getGameView() {
        return GameView;
    }

    public void setGameView(IArtifact GameView) {
        this.GameView = GameView;
    }



    public IArtifact getLocationView() {
        return LocationView;
    }

    public void setLocationView(IArtifact LocationView) {
        this.LocationView = LocationView;
    }

    public IArtifact getNationalityView() {
        return NationalityView;
    }

    public void setNationalityView(IArtifact NationalityView) {
        this.NationalityView = NationalityView;
    }

    public IArtifact getPlayerView() {
        return PlayerView;
    }

    public void setPlayerView(IArtifact PlayerView) {
        this.PlayerView = PlayerView;
    }

    public IArtifact getRefereeView() {
        return RefereeView;
    }

    public void setRefereeView(IArtifact RefereeView) {
        this.RefereeView = RefereeView;
    }

    public IArtifact getTrainerView() {
        return TrainerView;
    }

    public void setTrainerView(IArtifact TrainerView) {
        this.TrainerView = TrainerView;
    }

    public IArtifact getTournamentView() {
        return TournamentView;
    }

    public void setTournamentView(IArtifact TournamentView) {
        this.TournamentView = TournamentView;
    }


}
