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
        
        
        //Models
        IModel awardModel = new Award();
        IModel countryModel = new Country();
        IModel gameModel = new Game();
        IModel locationModel = new Location();
        IModel nationalityModel = new Nationality();
        IModel playerModel = new Player();
        IModel refereeModel = new Referee();
        IModel tournamentModel = new Tournament();
        IModel trainerModel = new Trainer();
        
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
    
        //Business
        ConectionDB conection = new ConectionDB();
        modelConnector.setConectionDB(conection);
        
        //MainView
        MainView mainView = new MainView();
        mainView.setViewConecctor(viewConecctor);
        mainView.setModelConnector(modelConnector);
        

        
        System.out.println(conection.getConectado()?"OK":"Error");
        
        
    
        System.out.println(System.currentTimeMillis()-initial+" milisegs");
    }
}
