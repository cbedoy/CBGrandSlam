
package cb.bussinessTest;

import cb.bussinessTest.ConectionDB;
import cb.interfaces.IBussiness;
import cb.interfaces.IModel;
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
public abstract class BaseModel implements IModel, IBussiness{

    protected  ConectionDB connection;
    protected  ResultSet   rs;
    protected  boolean     status;
    
    public BaseModel(){
            
    }
    
 
    @Override
    public void getAllITems(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.connection.closeConnection();
        
    }

    @Override
    public void insertItem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.connection.closeConnection();
    }

    @Override
    public void deleteITem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.connection.closeConnection();
    }

    @Override
    public void editITem(String query) {
        try {
            this.setStatus(getConnection().getSt().execute(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.connection.closeConnection();
    }

    @Override
    public void getITem(String query) {
        try {
            this.setRs(getConnection().getSt().executeQuery(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.connection.closeConnection();
    }

    public ConectionDB getConnection() {
        return connection;
    }

    public void setConnection(ConectionDB connection) {
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
