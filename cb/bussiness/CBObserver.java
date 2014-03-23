package cb.bussiness;

import cb.interfaces.ICBObserver;
import java.util.ArrayList;

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
 * 23-mar-2014 - 11:31:27
 */

public class CBObserver {
    private ArrayList<ICBObserver> observers;
    
    public CBObserver(){
        observers = new ArrayList<>();
    }
    
    public void addObserver(ICBObserver obs){
        observers.add(obs);
    }
    
    public void removeObserver(ICBObserver obs){
        observers.remove(obs);
    }
    
    public void notifyObserver(ICBObserver obs){
        obs.reloadData();
    }
    
    public void nofityAllObservers(){
        for(ICBObserver obs: observers)
            obs.reloadData();
    }
    
    public int countObservers(){
        return observers.size();
    }
}
