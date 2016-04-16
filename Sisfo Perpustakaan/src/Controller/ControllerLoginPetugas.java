/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AnggotaModel;
import model.PetugasModel;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Aplikasi;
import sisfo.perpustakaan.Petugas;
import view.LoginAnggota;
import view.LoginPetugas;

/**
 *
 * @author LENOVO
 */
public class ControllerLoginPetugas implements ActionListener {
    private Aplikasi model;
    private LoginPetugas view;

    public ControllerLoginPetugas(Aplikasi model) {
        this.model = model;
        view = new LoginPetugas();
        view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        PetugasModel pm = new PetugasModel();
        Petugas p = null;
        if (source.equals(view.getBtnLogin())) {
            try {
                p = pm.LoginPetugas(view.getID().getText(),view.getPassword().getText());
            } catch (SQLException ex) {
                Logger.getLogger(ControllerLoginAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(p!=null){
                Controller.ControllerDaftarPeminjaman cdp = new ControllerDaftarPeminjaman(model);    
            }
            
        }
    }
}
