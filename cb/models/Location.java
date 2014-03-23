/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

import cb.bussiness.BaseModel;
import cb.delegates.IModelDelegate;
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
public class Location extends BaseModel implements IModel, IModelDelegate{
    private int id;
    private String name;
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public void userPressInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressAlter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userPressSearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reloadData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
