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
import cb.bussiness.ConectionDB;
import cb.connectors.ModelConnector;
import cb.connectors.ViewConnector;
import cb.interfaces.IArtifact;
import cb.interfaces.IModel;
import cb.models.Award;
import cb.models.Country;
import cb.models.Game;
import cb.models.Location;
import cb.models.Nationality;
import cb.models.Player;
import cb.models.Referee;
import cb.models.Tournament;
import cb.models.Trainer;

import cb.views.*;

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
public class main {
    public static void main(String[]cbedoy){
        long initial = System.currentTimeMillis();
            
        Splash splash = new Splash();
        splash.setVisible(true);
        
        
        
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
        
        //Business
        ConectionDB conection = new ConectionDB();
        
        //Models
        Award       awardModel =        new Award();
        Country     countryModel =      new Country();
        Game        gameModel =         new Game();
        Location    locationModel =     new Location();
        Nationality nationalityModel =  new Nationality();
        Player      playerModel =       new Player();
        Referee     refereeModel =      new Referee();
        Tournament  tournamentModel =   new Tournament();
        Trainer     trainerModel =      new Trainer();
        
        
        //SetConnections to model
        awardModel.setConnection(conection);
        countryModel.setConnection(conection);
        gameModel.setConnection(conection);
        locationModel.setConnection(conection);
        nationalityModel.setConnection(conection);
        playerModel.setConnection(conection);
        refereeModel.setConnection(conection);
        tournamentModel.setConnection(conection);
        trainerModel.setConnection(conection);
        
        
        ModelConnector modelConnector = new ModelConnector();
        modelConnector.setAward(awardModel);
        modelConnector.setCountry(countryModel);
        modelConnector.setGame(gameModel);
        modelConnector.setLocation(locationModel);
        modelConnector.setNationality(nationalityModel);
        modelConnector.setPlayer(playerModel);
        modelConnector.setReferee(refereeModel);
        modelConnector.setTournament(tournamentModel);
        modelConnector.setTrainer(trainerModel);
    
        
        
        
        //MainView
        MainView mainView = new MainView();
        mainView.setViewConecctor(viewConecctor);
        mainView.setModelConnector(modelConnector);
        

        
        System.out.println(conection.getConectado()?"OK":"Error");
        
        
    
        System.out.println(System.currentTimeMillis()-initial+" milisegs");
    }
}
