/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.views;

import cb.artifacts.AwardView;
import cb.connectors.ViewConnector;
import cb.delegates.IMainViewDelegate;
import cb.interfaces.IArtifact;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class MainView extends javax.swing.JFrame implements IMainViewDelegate{

   
    private final int widthView     = 500;
    private final int heightView    = 300;
    private ViewConnector viewConecctor;
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        actionReload = new javax.swing.JMenuItem();
        actionAbout = new javax.swing.JMenuItem();
        actionExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        optionAward = new javax.swing.JMenuItem();
        optionCountry = new javax.swing.JMenuItem();
        optionGame = new javax.swing.JMenuItem();
        optionGrandSlam = new javax.swing.JMenuItem();
        optionLocation = new javax.swing.JMenuItem();
        optionNacionality = new javax.swing.JMenuItem();
        optionPlayer = new javax.swing.JMenuItem();
        optionReferee = new javax.swing.JMenuItem();
        optionTrainer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(71, 71, 71));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(238, 239, 243));

        jMenu5.setForeground(new java.awt.Color(51, 51, 51));
        jMenu5.setText("Home");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        actionReload.setText("Reload");
        jMenu5.add(actionReload);

        actionAbout.setText("About");
        jMenu5.add(actionAbout);

        actionExit.setText("Exit");
        jMenu5.add(actionExit);

        jMenuBar1.add(jMenu5);

        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Option");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        optionAward.setBackground(new java.awt.Color(238, 239, 243));
        optionAward.setForeground(new java.awt.Color(51, 51, 51));
        optionAward.setText("Award");
        optionAward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAwardActionPerformed(evt);
            }
        });
        jMenu1.add(optionAward);

        optionCountry.setBackground(new java.awt.Color(238, 239, 243));
        optionCountry.setForeground(new java.awt.Color(51, 51, 51));
        optionCountry.setText("Country");
        optionCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCountryActionPerformed(evt);
            }
        });
        jMenu1.add(optionCountry);

        optionGame.setBackground(new java.awt.Color(238, 239, 243));
        optionGame.setForeground(new java.awt.Color(51, 51, 51));
        optionGame.setText("Game");
        optionGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionGameActionPerformed(evt);
            }
        });
        jMenu1.add(optionGame);

        optionGrandSlam.setBackground(new java.awt.Color(238, 239, 243));
        optionGrandSlam.setForeground(new java.awt.Color(51, 51, 51));
        optionGrandSlam.setText("GrandSlam");
        optionGrandSlam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionGrandSlamActionPerformed(evt);
            }
        });
        jMenu1.add(optionGrandSlam);

        optionLocation.setBackground(new java.awt.Color(238, 239, 243));
        optionLocation.setForeground(new java.awt.Color(51, 51, 51));
        optionLocation.setText("Location");
        optionLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionLocationActionPerformed(evt);
            }
        });
        jMenu1.add(optionLocation);

        optionNacionality.setBackground(new java.awt.Color(238, 239, 243));
        optionNacionality.setForeground(new java.awt.Color(51, 51, 51));
        optionNacionality.setText("Nacionality");
        optionNacionality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionNacionalityActionPerformed(evt);
            }
        });
        jMenu1.add(optionNacionality);

        optionPlayer.setBackground(new java.awt.Color(238, 239, 243));
        optionPlayer.setForeground(new java.awt.Color(51, 51, 51));
        optionPlayer.setText("Player");
        optionPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionPlayerActionPerformed(evt);
            }
        });
        jMenu1.add(optionPlayer);

        optionReferee.setBackground(new java.awt.Color(238, 239, 243));
        optionReferee.setForeground(new java.awt.Color(51, 51, 51));
        optionReferee.setText("Referee");
        optionReferee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionRefereeActionPerformed(evt);
            }
        });
        jMenu1.add(optionReferee);

        optionTrainer.setBackground(new java.awt.Color(238, 239, 243));
        optionTrainer.setForeground(new java.awt.Color(51, 51, 51));
        optionTrainer.setText("Trainer");
        optionTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionTrainerActionPerformed(evt);
            }
        });
        jMenu1.add(optionTrainer);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Search");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionAwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAwardActionPerformed
        AwardView view = (AwardView) this.viewConecctor.getAwardView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        view.setDelegate(this);
        container.add(view);
        container.revalidate();
    }//GEN-LAST:event_optionAwardActionPerformed

    private void optionCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCountryActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getCountryView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionCountryActionPerformed

    private void optionGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionGameActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getGameView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionGameActionPerformed

    private void optionGrandSlamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionGrandSlamActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getTournamentView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionGrandSlamActionPerformed

    private void optionLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionLocationActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getLocationView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionLocationActionPerformed

    private void optionNacionalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionNacionalityActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getNationalityView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionNacionalityActionPerformed

    private void optionPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionPlayerActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getPlayerView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionPlayerActionPerformed

    private void optionRefereeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionRefereeActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getRefereeView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionRefereeActionPerformed

    private void optionTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionTrainerActionPerformed
        JPanel view = (JPanel) this.viewConecctor.getTrainerView();
        view.setVisible(true);
        view.setBounds(0, 0, this.widthView, this.heightView);
        container.add(view);
    }//GEN-LAST:event_optionTrainerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actionAbout;
    private javax.swing.JMenuItem actionExit;
    private javax.swing.JMenuItem actionReload;
    private javax.swing.JPanel container;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem optionAward;
    private javax.swing.JMenuItem optionCountry;
    private javax.swing.JMenuItem optionGame;
    private javax.swing.JMenuItem optionGrandSlam;
    private javax.swing.JMenuItem optionLocation;
    private javax.swing.JMenuItem optionNacionality;
    private javax.swing.JMenuItem optionPlayer;
    private javax.swing.JMenuItem optionReferee;
    private javax.swing.JMenuItem optionTrainer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void removeView(IArtifact artifact) {
        
        JPanel view = (JPanel) artifact;
        view.setVisible(false);   
    }

    public void setViewConecctor(ViewConnector viewConecctor) {
        this.viewConecctor = viewConecctor;
    }
}
