/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sisfo.perpustakaan.Aplikasi;
import view.LoginAnggota;

/**
 *
 * @author LENOVO
 */
public class ControllerLogoutAnggota implements ActionListener{
    private Aplikasi model;
    private LoginAnggota view;

    public ControllerLogoutAnggota(Aplikasi model) {
        this.model = model;
        view = new LoginAnggota();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
