/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.abstracts;

import cb.interfaces.IBissness;
import cb.interfaces.IModel;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public abstract class BaseModel implements IModel, IBissness{

    
    public ArrayList<IModel> models;
    
    @Override
    public void getAllITems(String query) {
        
    }

    @Override
    public void insertItem(String query) {
        
    }

    @Override
    public void deleteITem(String query) {
        
    }

    @Override
    public void editITem(String query) {
        
    }

    @Override
    public void getITem(String query) {
        
    }
    
}
