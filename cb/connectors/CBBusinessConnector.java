/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.connectors;

import cb.bussiness.CBBaseModel;
import cb.interfaces.ICBModel;

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
public class CBBusinessConnector {
    private CBBaseModel AwardBusiness;
    private CBBaseModel CountryBusiness;
    private CBBaseModel GameBusiness;
    private CBBaseModel TournamentBusiness;
    private CBBaseModel LocationBusiness;
    private CBBaseModel NAtionalityBusiness;
    private CBBaseModel PlayerBusiness;
    private CBBaseModel RefereeBusiness;
    private CBBaseModel TrainerBusiness;
    private ICBModel   Conection;
    
    public  CBBusinessConnector(){
        
    }

    public CBBaseModel getAwardBusiness() {
        return AwardBusiness;
    }

    public void setAwardBusiness(CBBaseModel AwardBusiness) {
        this.AwardBusiness = AwardBusiness;
    }

    public CBBaseModel getCountryBusiness() {
        return CountryBusiness;
    }

    public void setCountryBusiness(CBBaseModel CountryBusiness) {
        this.CountryBusiness = CountryBusiness;
    }

    public CBBaseModel getGameBusiness() {
        return GameBusiness;
    }

    public void setGameBusiness(CBBaseModel GameBusiness) {
        this.GameBusiness = GameBusiness;
    }

    public CBBaseModel getTournamentBusiness() {
        return TournamentBusiness;
    }

    public void setGrandSlamBusiness(CBBaseModel TournamentBusiness) {
        this.TournamentBusiness = TournamentBusiness;
    }

    public CBBaseModel getLocationBusiness() {
        return LocationBusiness;
    }

    public void setLocationBusiness(CBBaseModel LocationBusiness) {
        this.LocationBusiness = LocationBusiness;
    }

    public CBBaseModel getNAtionalityBusiness() {
        return NAtionalityBusiness;
    }

    public void setNAtionalityBusiness(CBBaseModel NAtionalityBusiness) {
        this.NAtionalityBusiness = NAtionalityBusiness;
    }

    public CBBaseModel getPlayerBusiness() {
        return PlayerBusiness;
    }

    public void setPlayerBusiness(CBBaseModel PlayerBusiness) {
        this.PlayerBusiness = PlayerBusiness;
    }

    public CBBaseModel getRefereeBusiness() {
        return RefereeBusiness;
    }

    public void setRefereeBusiness(CBBaseModel RefereeBusiness) {
        this.RefereeBusiness = RefereeBusiness;
    }

    public CBBaseModel getTrainerBusiness() {
        return TrainerBusiness;
    }

    public void setTrainerBusiness(CBBaseModel TrainerBusiness) {
        this.TrainerBusiness = TrainerBusiness;
    }

    public ICBModel getConection() {
        return Conection;
    }

    public void setConnection(ICBModel Conection) {
        this.Conection = Conection;
    }

}
