/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.delegates;

/**
 *
 * @author Carlos
 */
public interface IViewDelegate {
    public void userPressInsert(String query);
    public void userPressDelete(String query);
    public void userPressAfter(String query);
    public void userPressSearch(String query);
    
}