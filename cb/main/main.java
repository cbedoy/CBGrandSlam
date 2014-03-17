/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.main;

import cb.artifacts.AwardView;
import cb.artifacts.CountryView;
import cb.artifacts.GameView;
import cb.artifacts.TournamentView;
import cb.artifacts.LocationView;
import cb.artifacts.NationalityView;
import cb.artifacts.PlayerView;
import cb.artifacts.RefereeView;
import cb.artifacts.TrainerView;
import cb.connectors.ViewConnector;
import cb.interfaces.IArtifact;

import cb.views.*;

/**
 *
 * @author Carlos
 */
public class main {
    public static void main(String[]cbedoy){
        long initial = System.currentTimeMillis();
        //Artifacts 
        
        IArtifact awardView = new AwardView();
        IArtifact countryView = new CountryView();
        IArtifact gameView = new GameView();
        IArtifact tournamentView = new TournamentView();
        IArtifact locationView = new LocationView();
        IArtifact nationalityView  = new NationalityView();
        IArtifact playerView = new PlayerView();
        IArtifact refereeView = new RefereeView();
        IArtifact trainerView = new TrainerView();
        
        //ViewConnector
        ViewConnector viewConecctor = new ViewConnector();
        viewConecctor.setAwardView(awardView);
        viewConecctor.setCountryView(countryView);
        viewConecctor.setGameView(gameView);
        viewConecctor.setTournamentView(tournamentView);
        viewConecctor.setLocationView(locationView);
        viewConecctor.setNationalityView(nationalityView);
        viewConecctor.setPlayerView(playerView);
        viewConecctor.setRefereeView(refereeView);
        viewConecctor.setTrainerView(trainerView);
        
        
        //MainView
        MainView mainView = new MainView();
        mainView.setViewConecctor(viewConecctor);
        
        System.out.println(System.currentTimeMillis()-initial+" milisegs");
    }
}
