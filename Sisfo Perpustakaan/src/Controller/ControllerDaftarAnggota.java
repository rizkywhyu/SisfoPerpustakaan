/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.AnggotaModel;
import sisfo.perpustakaan.Aplikasi;
import view.DaftarAnggota;
import view.LoginPetugas;

/**
 *
 * @author LENOVO
 */
public class ControllerDaftarAnggota implements ActionListener {
    private Aplikasi model;
    private DaftarAnggota view;

    public ControllerDaftarAnggota(Aplikasi model) {
        this.model = model;
        view = new DaftarAnggota();
        view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        AnggotaModel am = new AnggotaModel();
        
    }
}
