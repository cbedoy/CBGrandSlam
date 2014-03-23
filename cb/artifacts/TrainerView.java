/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.artifacts;

import cb.delegates.IMainViewDelegate;
import cb.interfaces.IArtifact;
import cb.interfaces.IModel;
import cb.models.Country;
import cb.models.Trainer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

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
public class TrainerView extends javax.swing.JPanel implements IArtifact, Observer {

    private IMainViewDelegate   delegate;
    private Trainer             currentModel;
    private ArrayList<Trainer>  data;
    /**
     * Creates new form TrainerView
     */
    public TrainerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        actionAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        actionDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        actionSearch = new javax.swing.JButton();
        sName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sOption = new javax.swing.JComboBox();
        sInitialDate = new com.toedter.calendar.JDateChooser();
        sLastDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(71, 71, 71));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        actionEdit.setBackground(new java.awt.Color(255, 153, 0));
        actionEdit.setText("Edit");
        actionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionEditActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose an option");

        actionAdd.setBackground(new java.awt.Color(0, 204, 51));
        actionAdd.setText("Add");
        actionAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        actionDelete.setBackground(new java.awt.Color(255, 0, 0));
        actionDelete.setText("Delete");
        actionDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trainer");

        actionSearch.setBackground(new java.awt.Color(0, 102, 204));
        actionSearch.setText("Search");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Initial date");

        sOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(actionAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sName)
                            .addComponent(sOption, javax.swing.GroupLayout.Alignment.TRAILING, 0, 345, Short.MAX_VALUE)
                            .addComponent(sInitialDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sLastDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(sInitialDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actionAdd)
                            .addComponent(actionEdit)
                            .addComponent(actionDelete)
                            .addComponent(actionSearch)))
                    .addComponent(sLastDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionAddActionPerformed
        // TODO add your handling code here:
        Trainer model = currentModel;
        model.setName(this.sName.getText());
        
        String initial =    new SimpleDateFormat("yyyy-MM-dd").format(this.sInitialDate.getDate());
        String finalize =   new SimpleDateFormat("yyyy-MM-dd").format(this.sLastDate.getDate());
        model.setInitialDate(initial);
        model.setFinalizeDate(finalize);
        model.userPressInsert();
        model.reloadData();
        reloadData();
    }//GEN-LAST:event_actionAddActionPerformed

    private void actionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionEditActionPerformed
        // TODO add your handling code here:
        Trainer trainer = currentModel;
        trainer.setName(this.sName.getText());
        String initial =    new SimpleDateFormat("yyyy-MM-dd").format(this.sInitialDate.getDate());
        String finalize =   new SimpleDateFormat("yyyy-MM-dd").format(this.sLastDate.getDate());
        trainer.setInitialDate(initial);
        trainer.setFinalizeDate(finalize);
        trainer.userPressAlter();
        trainer.reloadData();
        reloadData();
    }//GEN-LAST:event_actionEditActionPerformed

    private void actionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDeleteActionPerformed
        // TODO add your handling code here:
        Trainer trainer = currentModel;
        Trainer currentTrainer = data.get(sOption.getSelectedIndex());
        trainer.setName(currentTrainer.getName());
        trainer.setId(currentTrainer.getId());
        trainer.userPressDelete();
        trainer.reloadData();
        reloadData();
    }//GEN-LAST:event_actionDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionAdd;
    private javax.swing.JButton actionDelete;
    private javax.swing.JButton actionEdit;
    private javax.swing.JButton actionSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser sInitialDate;
    private com.toedter.calendar.JDateChooser sLastDate;
    private javax.swing.JTextField sName;
    private javax.swing.JComboBox sOption;
    // End of variables declaration//GEN-END:variables

    public void setDelegate(IMainViewDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public IModel getModel() {
        return currentModel;
    }

    public void setModel(IModel model) {
        this.currentModel = (Trainer) model;
    }

   
    public void reloadData(){
        Trainer trainer = currentModel;
        trainer.reloadData();
        data = trainer.getListTrainer();
        sOption.removeAllItems();
        for(Trainer t : data){
            sOption.addItem(t.getName());
        }
    }
}
