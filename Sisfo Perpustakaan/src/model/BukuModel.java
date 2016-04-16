/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Buku;

/**
 *
 * @author LENOVO
 */
public class BukuModel {
    database.database db = new database.database();
    public Buku displayBuku() throws SQLException{
        Buku b = null;
        ResultSet rs = db.displayBuku();
        while (rs.next()) {
            b = new Buku(rs.getString("judul"), rs.getString("pengarang"), rs.getInt("tahun_masuk_buku"), rs.getString("tipe"), rs.getString("id_buku"), rs.getBoolean("status"));
        }
        return b;
    }
    
    public Buku insertBuku() throws SQLException{
        Buku b =null;
        ResultSet rs = db.insertBuku(b);
        while (rs.next()) {
            b = new Buku(rs.getString("judul"), rs.getString("pengarang"), rs.getInt("tahun_masuk_buku"), rs.getString("tipe"), rs.getString("id_buku"), rs.getBoolean("status"));
        }
        return b;
    }
    
    public Buku deleteBuku() throws SQLException{
        Buku b =null;
        ResultSet rs = db.deleteBuku(b.getIdBuku());
        while (rs.next()) {
            b = new Buku(rs.getString("judul"), rs.getString("pengarang"), rs.getInt("tahun_masuk_buku"), rs.getString("tipe"), rs.getString("id_buku"), rs.getBoolean("status"));
        }
        return b;
    }
    
    public Buku getBuku() throws SQLException{
        Buku b =null;
        ResultSet rs = db.getBuku(b.getIdBuku());
        while (rs.next()) {
            b = new Buku(rs.getString("judul"), rs.getString("pengarang"), rs.getInt("tahun_masuk_buku"), rs.getString("tipe"), rs.getString("id_buku"), rs.getBoolean("status"));
        }
        return b;
    }
}
