/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sisfo.perpustakaan.Aplikasi;
import view.DaftarBuku;

/**
 *
 * @author LENOVO
 */
public class ControllerDaftarBuku implements ActionListener {
    private Aplikasi model;
    private DaftarBuku view;

    public ControllerDaftarBuku(Aplikasi model) {
        this.model = model;
        view = new DaftarBuku();
        view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
