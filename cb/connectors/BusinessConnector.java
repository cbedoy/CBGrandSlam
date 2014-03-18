/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.connectors;

import cb.abstracts.BaseModel;
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
public class BusinessConnector {
    private BaseModel AwardBusiness;
    private BaseModel CountryBusiness;
    private BaseModel GameBusiness;
    private BaseModel TournamentBusiness;
    private BaseModel LocationBusiness;
    private BaseModel NAtionalityBusiness;
    private BaseModel PlayerBusiness;
    private BaseModel RefereeBusiness;
    private BaseModel TrainerBusiness;
    private IModel    Conection;
    
    public  BusinessConnector(){
        
    }

    public BaseModel getAwardBusiness() {
        return AwardBusiness;
    }

    public void setAwardBusiness(BaseModel AwardBusiness) {
        this.AwardBusiness = AwardBusiness;
    }

    public BaseModel getCountryBusiness() {
        return CountryBusiness;
    }

    public void setCountryBusiness(BaseModel CountryBusiness) {
        this.CountryBusiness = CountryBusiness;
    }

    public BaseModel getGameBusiness() {
        return GameBusiness;
    }

    public void setGameBusiness(BaseModel GameBusiness) {
        this.GameBusiness = GameBusiness;
    }

    public BaseModel getTournamentBusiness() {
        return TournamentBusiness;
    }

    public void setGrandSlamBusiness(BaseModel TournamentBusiness) {
        this.TournamentBusiness = TournamentBusiness;
    }

    public BaseModel getLocationBusiness() {
        return LocationBusiness;
    }

    public void setLocationBusiness(BaseModel LocationBusiness) {
        this.LocationBusiness = LocationBusiness;
    }

    public BaseModel getNAtionalityBusiness() {
        return NAtionalityBusiness;
    }

    public void setNAtionalityBusiness(BaseModel NAtionalityBusiness) {
        this.NAtionalityBusiness = NAtionalityBusiness;
    }

    public BaseModel getPlayerBusiness() {
        return PlayerBusiness;
    }

    public void setPlayerBusiness(BaseModel PlayerBusiness) {
        this.PlayerBusiness = PlayerBusiness;
    }

    public BaseModel getRefereeBusiness() {
        return RefereeBusiness;
    }

    public void setRefereeBusiness(BaseModel RefereeBusiness) {
        this.RefereeBusiness = RefereeBusiness;
    }

    public BaseModel getTrainerBusiness() {
        return TrainerBusiness;
    }

    public void setTrainerBusiness(BaseModel TrainerBusiness) {
        this.TrainerBusiness = TrainerBusiness;
    }

    public IModel getConection() {
        return Conection;
    }

    public void setConection(IModel Conection) {
        this.Conection = Conection;
    }

}
