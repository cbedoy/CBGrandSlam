/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.main;

import cb.artifacts.AwardView;
import cb.bisness.ViewConecctor;
import cb.interfaces.IArtifact;
import cb.views.MainView;

/**
 *
 * @author Carlos
 */
public class main {
    public static void main(String[]cbedoy){
        IArtifact awardView = new AwardView();
        
        ViewConecctor viewConecctor = new ViewConecctor();
        viewConecctor.setAwardView(awardView);
        
        MainView mainView = new MainView();
        mainView.setViewConecctor(viewConecctor);
    }
}
