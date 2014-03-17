/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.interfaces;

/**
 *
 * @author Carlos
 */
public interface IBussiness {
    
    public void     getAllITems(String query);
    public void     insertItem(String query);
    public void     deleteITem(String query);
    public void     editITem(String query);
    public void     getITem(String query);
    
    
}
