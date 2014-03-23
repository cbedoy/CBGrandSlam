

package cb.artifacts;

import cb.bussiness.ConectionDB;
import cb.delegates.IMainViewDelegate;
import cb.interfaces.IArtifact;
import cb.interfaces.IModel;
import cb.models.Country;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

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
public class CountryView extends javax.swing.JPanel implements IArtifact, Observer{

    private IMainViewDelegate   delegate;
    private Country             currentModel;
    private ArrayList<Country>  data;
    public CountryView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sOption = new javax.swing.JComboBox();
        actionAdd = new javax.swing.JButton();
        actionEdit = new javax.swing.JButton();
        actionDelete = new javax.swing.JButton();
        actionSearch = new javax.swing.JButton();
        sStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 71, 71));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Country");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose an option");

        sOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        actionAdd.setBackground(new java.awt.Color(0, 204, 51));
        actionAdd.setText("Add");
        actionAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionAddActionPerformed(evt);
            }
        });

        actionEdit.setBackground(new java.awt.Color(255, 153, 0));
        actionEdit.setText("Edit");
        actionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionEditActionPerformed(evt);
            }
        });

        actionDelete.setBackground(new java.awt.Color(255, 0, 0));
        actionDelete.setText("Delete");
        actionDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDeleteActionPerformed(evt);
            }
        });

        actionSearch.setBackground(new java.awt.Color(0, 102, 204));
        actionSearch.setText("Search");
        actionSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSearchActionPerformed(evt);
            }
        });

        sStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sStatus.setForeground(new java.awt.Color(51, 204, 0));
        sStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sName)
                                    .addComponent(sOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sStatus))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 132, Short.MAX_VALUE)
                        .addComponent(actionAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(sStatus))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionAdd)
                    .addComponent(actionEdit)
                    .addComponent(actionDelete)
                    .addComponent(actionSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionAddActionPerformed
        
        Country country = currentModel;
        country.setName(this.sName.getText());
        country.userPressInsert();
        country.reloadData();
        reloadData();
        
    }//GEN-LAST:event_actionAddActionPerformed

    private void actionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDeleteActionPerformed
        
        Country country = currentModel;
        Country currentCountry = data.get(sOption.getSelectedIndex());
        country.setName(currentCountry.getName());
        country.setId(currentCountry.getId());
        country.userPressDelete();
        country.reloadData();
        reloadData();
    }//GEN-LAST:event_actionDeleteActionPerformed

    private void actionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionEditActionPerformed
        
        Country country = currentModel;
        country.setName(this.sName.getText());
        country.userPressAlter();
        country.reloadData();
        reloadData();
    }//GEN-LAST:event_actionEditActionPerformed

    private void actionSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actionSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionAdd;
    private javax.swing.JButton actionDelete;
    private javax.swing.JButton actionEdit;
    private javax.swing.JButton actionSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sName;
    private javax.swing.JComboBox sOption;
    private javax.swing.JLabel sStatus;
    // End of variables declaration//GEN-END:variables

    public void setDelegate(IMainViewDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public void update(Observable o, Object o1) {
       
    }

    public IModel getModel() {
        return currentModel;
    }

    public void setModel(IModel model) {
        this.currentModel = (Country) model;
    }

   
    public void reloadData(){
        Country country = currentModel;
        country.reloadData();
        data = country.getListCountry();
        sOption.removeAllItems();
        for(Country c : data){
            sOption.addItem(c.getName());
        }
    }
}
