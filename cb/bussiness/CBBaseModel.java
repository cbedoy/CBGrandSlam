
package cb.bussiness;

import cb.bussiness.CBConectionMySQL;
import cb.interfaces.ICBBussiness;
import cb.interfaces.ICBModel;
import java.sql.ResultSet;
import java.sql.SQLException;

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
public abstract class CBBaseModel implements ICBModel, ICBBussiness{

    private  CBConectionMySQL connection;
    private  ResultSet   rs;
    private  boolean     status;
    
    public CBBaseModel(){
            
    }
    
 
    @Override
    public void getAllITems(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }

    @Override
    public void insertItem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void deleteITem(String query) {
        
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @Override
    public void editITem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void getITem(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    public CBConectionMySQL getConnection() {
        return connection;
    }

    public void setConnection(CBConectionMySQL connection) {
        this.connection = connection;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
