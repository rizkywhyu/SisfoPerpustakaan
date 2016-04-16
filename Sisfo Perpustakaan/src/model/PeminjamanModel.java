/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import sisfo.perpustakaan.Peminjaman;

/**
 *
 * @author LENOVO
 */
public class PeminjamanModel {
    database.database db = new database.database();
    public Peminjaman displayPeminjaman() throws SQLException{
        Peminjaman pj = null;
        ResultSet rs = db.displayPeminjaman();
        while (rs.next()) {
            pj = new Peminjaman(rs.getLong("id_peminjaman"));
        }
        return pj;
    }
}
