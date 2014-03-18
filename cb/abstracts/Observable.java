

package cb.abstracts;

import cb.interfaces.IObserver;
import java.util.ArrayList;

/**
 *
 * @author Carlos Alfredo Cervantes Bedoy
 * Mobile Developer
 * CBGrandSlam
 * Email:           carlos.bedoy@gmail.com
 * Facebook:        https://www.facebook.com/carlos.bedoy
 * Github:          https://github.com/cbedoy
 * WebSite:         http://cbedoy.github.io/
 *
 * 17-mar-2014 - 22:22:34
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
