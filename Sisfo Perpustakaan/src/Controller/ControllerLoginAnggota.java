/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AnggotaModel;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Aplikasi;
import view.Home;
import view.LoginAnggota;

/**
 *
 * @author LENOVO
 */
public class ControllerLoginAnggota implements ActionListener {

    private Aplikasi model;
    private LoginAnggota view;

    public ControllerLoginAnggota(Aplikasi model) {
        this.model = model;
        view = new LoginAnggota();
        view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        AnggotaModel am = new AnggotaModel();
        Anggota a = null;
        if (source.equals(view.getjButton1())) {
            try {
                a = am.LoginAnggota(view.getNIM().getText(),view.getPass().getText());
            } catch (SQLException ex) {
                Logger.getLogger(ControllerLoginAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(a!=null){
                Controller.ControllerHome ch = new ControllerHome(model);    
            }
            
        }
    }
}
