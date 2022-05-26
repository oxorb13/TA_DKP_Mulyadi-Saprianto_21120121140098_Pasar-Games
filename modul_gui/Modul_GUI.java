/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mulyadi Saprianto
 */
public class Modul_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loading_bar load = new loading_bar();
        load.setVisible(true);
        load.setSize(500,500);
        load.setResizable(true);
        
        login login = new login();
        try {
            for(int i = 0; i <= 100;i++){
                Thread.sleep(100);
                load.Load_bar.setValue(i);
                if ( i == 100){
                    JOptionPane.showMessageDialog(null, "loading berhasil");
                    login.setVisible(true);
                    login.setSize(500,570);
                    login.setResizable(true);
                    load.setVisible(false);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Modul_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
