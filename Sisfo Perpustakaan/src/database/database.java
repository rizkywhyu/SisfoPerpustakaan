/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Aplikasi;
import sisfo.perpustakaan.Buku;
import sisfo.perpustakaan.Peminjaman;

public class database {

    private Statement stat;
    private Connection conn;
    private ResultSet rs;

    public database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            stat = conn.createStatement();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void insertAnggota(Anggota a) {
        try {
            String s = "insert into anggota values(" + a.getNim() + ",'" + a.getNama() + "','" + a.getJenisKelamin() + "','" + a.getJurusan() + "','" + a.getKelas() + "','" + a.getThnmasuk() + "','" + a.getPassword() + "')";
            stat.execute(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Anggota getAnggota(String nim) {
        Anggota a = null;
        try {
            String s = "select * from anggota where nim =" + nim;
            rs = stat.executeQuery(s);
            while (rs.next()) {
                a = new Anggota(rs.getString(2), rs.getString(7), rs.getString(3), rs.getString(1), rs.getString(5), rs.getString(4), rs.getInt(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public void displayAnggota() {
        try {
            String s = "select* from anggota";
            rs = stat.executeQuery(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertBuku(Buku b) {
        try {
            String s = "insert into anggota values(" + b.getIdBuku() + ",'" + b.getJudul() + "','" + b.getPengarang() + "','" + b.getTipe() + "','" + b.getThnMasukBuku() + "','" + b.getStatus() + "')";
            stat.execute(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Buku getBuku(String idBuku) {
        Buku b = null;
        try {
            String s = "select * from buku where id_buku =" + idBuku;
            rs = stat.executeQuery(s);
            while (rs.next()) {
                b = new Buku(rs.getString(2), rs.getString(3), rs.getInt(5), rs.getString(4), rs.getString(1), rs.getBoolean(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    public void deleteBuku(String idBuku) {
        try {
            String s = "delete from buku where id_buku =" + idBuku;
            stat.execute(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayBuku() {
        try {
            String s = "select* from buku";
            rs = stat.executeQuery(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayPeminjaman(String idBuku) {
        try {
            String s = "select b.id_buku, b.judul, a.nim, a.nama,p.status_pinjam from buku b, anggota a, peminjaman p where b.id_buku=p.id_buku and a.nim=p.nim";
            stat.execute(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void query(String SQLString) {
        try {
            stat.executeUpdate(SQLString);
        } catch (Exception e) {
        }
    }

    
    public ResultSet getData(String SQLString){
        try {
            rs = stat.executeQuery(SQLString);
        } catch (Exception e) {
        }
        return rs;
    }

    
}
