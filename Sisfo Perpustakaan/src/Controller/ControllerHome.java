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
import model.BukuModel;
import sisfo.perpustakaan.Aplikasi;
import sisfo.perpustakaan.Buku;
import view.Home;


/**
 *
 * @author LENOVO
 */
public class ControllerHome implements ActionListener{
    private Aplikasi model;
    private Home view;

    public ControllerHome(Aplikasi model) {
        this.model = model;
        view = new Home();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); 
        BukuModel bm = new BukuModel();
        Buku b = null;
        if (source.equals(view.getBtnlogout())) {
            ControllerLoginAnggota cl = new ControllerLoginAnggota(model);
        }
            
    }
}

