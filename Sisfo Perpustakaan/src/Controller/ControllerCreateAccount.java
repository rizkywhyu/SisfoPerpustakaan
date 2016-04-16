/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Aplikasi;
import view.CreateAccount;

/**
 *
 * @author Rizky
 */
public class ControllerCreateAccount {

    Aplikasi model;
    CreateAccount view;
    Anggota a;
    private ActionListener al;

    public ControllerCreateAccount(Aplikasi model) {
        this.model = model;
        view = new CreateAccount();
        view.setVisible(true);
        view.addListener(this);
        this.a = null;

        this.view.getNim().addActionListener(al);
        this.view.getNama().addActionListener(al);
        this.view.getJenisk().addActionListener(al);
        this.view.getJur().addActionListener(al);
        this.view.getKelas().addActionListener(al);
        this.view.getTahun().addActionListener(al);
        this.view.getPass().addActionListener(al);

    }

    public ControllerCreateAccount(Aplikasi model, Anggota a) {
        this.model = model;
        view = new CreateAccount();
        view.setVisible(true);
        view.addListener(al);
        this.a = a;
        view.setNim(a.getNim());
        view.setNama(a.getNama());
        view.setJenisk(a.getJenisKelamin());
        view.setJur(a.getJurusan());
        view.setKelas(a.getKelas());
        view.setTahun(a.getThnmasuk());
        view.setPass(a.getPassword());

        view.getBtncreate().setText("Update");
        view.setTitle("Edit Pelanggan");
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if (source.equals(view.getBtncreate())) {
            JTextField nim = view.getNim();
            JTextField nama = view.getNama();
            JComboBox<String> jenisk = view.getJenisk();
            JTextField jur = view.getJur();
            JTextField kelas = view.getKelas();
            JTextField tahun = view.getTahun();
            JTextField pass = view.getPass();
            if (a== null) {
                String nim = model.addAnggota(nama, password, jenisKelamin, nim, kelas, jurusan, 0);
                view.showMessage(view, "NIM Anda = " + nim);
                view.setNim((""));
                view.setNama("");
            } else{
                p.setNama(nama);
                p.setAddress(alamat);
                model.updatePelanggan(p);
                JOptionPane.showMessageDialog(view, "ID Pelanggan "+p.getIdPelanggan()+" berhasil di update");
                new ControllerViewPelanggan(model);
                view.dispose();
            }
        } else if(source.equals(view.getBtnBack())){
            new ControllerViewPelanggan(model);
            view.dispose();
        }
    }
}
