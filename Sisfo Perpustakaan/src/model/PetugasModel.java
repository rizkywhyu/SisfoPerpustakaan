/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import sisfo.perpustakaan.Petugas;

/**
 *
 * @author LENOVO
 */
public class PetugasModel {
    database.database db = new database.database();
    public Petugas LoginPetugas(String idPetugas, String pass) throws SQLException {
        Petugas p = null;
        ResultSet rs = db.LoginPetugas(idPetugas, pass);
        while (rs.next()) {
                p = new Petugas(rs.getString("nama"), rs.getString("password"), rs.getString("jenis_kelamin"), rs.getLong("id_petugas"));
            }
        return p;
    }
}
