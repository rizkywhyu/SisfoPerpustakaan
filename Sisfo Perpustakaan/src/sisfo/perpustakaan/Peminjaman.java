/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    private int tglPeminjaman;
    private int tglPengembalian;
    private double denda;
    private Buku[] pinjaman;
    private Anggota peminjam;
    private boolean statusPinjam;
    
    public void addPinjaman(Buku b, Anggota a){
        
    }

    public int getTglPeminjaman() {
        return tglPeminjaman;
    }

    public void setTglPeminjaman(int tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman;
    }

    public int getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(int tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }
    
}
