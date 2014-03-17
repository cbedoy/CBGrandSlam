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
 * @author Carlos
 */
public class BissnessConnector {
    private BaseModel AwardBisness;
    private BaseModel CountryBisness;
    private BaseModel GameBisness;
    private BaseModel GrandSlamBisness;
    private BaseModel LocationBisness;
    private BaseModel NAtionalityBisness;
    private BaseModel PlayerBisness;
    private BaseModel RefereeBisness;
    private BaseModel TrainerBisness;
    private IModel    Conection;
    
    public  BissnessConnector(){
        
    }

    public BaseModel getAwardBisness() {
        return AwardBisness;
    }

    public void setAwardBisness(BaseModel AwardBisness) {
        this.AwardBisness = AwardBisness;
    }

    public BaseModel getCountryBisness() {
        return CountryBisness;
    }

    public void setCountryBisness(BaseModel CountryBisness) {
        this.CountryBisness = CountryBisness;
    }

    public BaseModel getGameBisness() {
        return GameBisness;
    }

    public void setGameBisness(BaseModel GameBisness) {
        this.GameBisness = GameBisness;
    }

    public BaseModel getGrandSlamBisness() {
        return GrandSlamBisness;
    }

    public void setGrandSlamBisness(BaseModel GrandSlamBisness) {
        this.GrandSlamBisness = GrandSlamBisness;
    }

    public BaseModel getLocationBisness() {
        return LocationBisness;
    }

    public void setLocationBisness(BaseModel LocationBisness) {
        this.LocationBisness = LocationBisness;
    }

    public BaseModel getNAtionalityBisness() {
        return NAtionalityBisness;
    }

    public void setNAtionalityBisness(BaseModel NAtionalityBisness) {
        this.NAtionalityBisness = NAtionalityBisness;
    }

    public BaseModel getPlayerBisness() {
        return PlayerBisness;
    }

    public void setPlayerBisness(BaseModel PlayerBisness) {
        this.PlayerBisness = PlayerBisness;
    }

    public BaseModel getRefereeBisness() {
        return RefereeBisness;
    }

    public void setRefereeBisness(BaseModel RefereeBisness) {
        this.RefereeBisness = RefereeBisness;
    }

    public BaseModel getTrainerBisness() {
        return TrainerBisness;
    }

    public void setTrainerBisness(BaseModel TrainerBisness) {
        this.TrainerBisness = TrainerBisness;
    }

    public IModel getConection() {
        return Conection;
    }

    public void setConection(IModel Conection) {
        this.Conection = Conection;
    }
    
    
    
    
}
