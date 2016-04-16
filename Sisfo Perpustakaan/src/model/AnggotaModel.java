/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import sisfo.perpustakaan.Anggota;

/**
 *
 * @author LENOVO
 */
public class AnggotaModel {

    database.database db = new database.database();

    public Anggota LoginAnggota(String nim, String pass) throws SQLException {
        Anggota a = null;
        ResultSet rs = db.LoginAnggota(nim, pass);
        while (rs.next()) {
                a = new Anggota(rs.getString(2), rs.getString(7), rs.getString(3), rs.getString(1), rs.getString(5), rs.getString(4), rs.getInt(6));
            }
        return a;
    }
    
    public Anggota insertAnggota() throws SQLException{
        Anggota a = null;
        ResultSet rs = db.insertAnggota(a);
        while (rs.next()) {
                a = new Anggota(rs.getString(2), rs.getString(7), rs.getString(3), rs.getString(1), rs.getString(5), rs.getString(4), rs.getInt(6));
            }
        return a;
    }
    
    public Anggota getAnggota() throws SQLException{
        Anggota a = null;
        ResultSet rs = db.getAnggota(a.getNim());
        while (rs.next()) {
                a = new Anggota(rs.getString(2), rs.getString(7), rs.getString(3), rs.getString(1), rs.getString(5), rs.getString(4), rs.getInt(6));
            }
        return a;
    }

}
