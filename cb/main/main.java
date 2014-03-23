

package cb.main;
//Artifacts 
import cb.artifacts.AwardView;
import cb.artifacts.CountryView;
import cb.artifacts.GameView;
import cb.artifacts.TournamentView;
import cb.artifacts.LocationView;
import cb.artifacts.NationalityView;
import cb.artifacts.PlayerView;
import cb.artifacts.RefereeView;
import cb.artifacts.TrainerView;
//Bussiness
import cb.bussiness.ConectionDB;
import cb.bussiness.ModelObserver;
//Connectors
import cb.connectors.ModelConnector;
import cb.connectors.ViewConnector;
//Models
import cb.models.Award;
import cb.models.Country;
import cb.models.Game;
import cb.models.Location;
import cb.models.Nationality;
import cb.models.Player;
import cb.models.Referee;
import cb.models.Tournament;
import cb.models.Trainer;
//
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
        //Splash    
        Splash      splash =            new Splash();
        splash.setVisible(true);
        
        //Artifacts 
        
        AwardView       awardView =         new AwardView();
        CountryView     countryView =       new CountryView();
        GameView        gameView =          new GameView();
        TournamentView  tournamentView =    new TournamentView();
        LocationView    locationView =      new LocationView();
        NationalityView nationalityView  =  new NationalityView();
        PlayerView      playerView =        new PlayerView();
        RefereeView     refereeView =       new RefereeView();
        TrainerView     trainerView =       new TrainerView();
        
        //ViewConnector
        ViewConnector viewConecctor =   new ViewConnector();
        viewConecctor.setAwardView(awardView);
        viewConecctor.setCountryView(countryView);
        viewConecctor.setGameView(gameView);
        viewConecctor.setTournamentView(tournamentView);
        viewConecctor.setLocationView(locationView);
        viewConecctor.setNationalityView(nationalityView);
        viewConecctor.setPlayerView(playerView);
        viewConecctor.setRefereeView(refereeView);
        viewConecctor.setTrainerView(trainerView);
        
        //Observers
        ModelObserver viewObserver =         new ModelObserver();
        viewObserver.addObserver(awardView);
        viewObserver.addObserver(countryView);
        viewObserver.addObserver(gameView);
        viewObserver.addObserver(tournamentView);
        viewObserver.addObserver(nationalityView);
        viewObserver.addObserver(playerView);
        viewObserver.addObserver(refereeView);
        viewObserver.addObserver(trainerView);
        
        
        
        System.out.println(viewObserver.countObservers());
        
        
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
        mainView.setViewObserver(viewObserver);
        splash.dispose();

        
        System.out.println(conection.getConectado()?"OK":"Error");
        
        
    
        System.out.println(System.currentTimeMillis()-initial+" milisegs");
    }
}
