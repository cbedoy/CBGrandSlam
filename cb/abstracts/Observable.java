/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.abstracts;

import cb.interfaces.IObserver;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public abstract class Observable {
    
    private ArrayList<IObserver> observers;
    
    public Observable(){
        this.observers = new ArrayList<IObserver>();
    }
    
    public void addObserver(IObserver observer){
        this.observers.add(observer);
    }
    
    public void removeObserver(IObserver observer){
        this.observers.remove(observer);
    }
    
    public void notifyObserver(){
        for(IObserver observer : observers)
            observer.reload();
    } 
    
}
