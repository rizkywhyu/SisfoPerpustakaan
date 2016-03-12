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

    private int idPeminjaman;
    private Buku[] buku = new Buku[10];
    private int nBuku;
    private Anggota peminjam;
    private boolean statusPeminjaman;

    public Peminjaman(int idPeminjaman, int jum) {
        this.idPeminjaman = idPeminjaman;
        this.buku = new Buku[jum];
    }

    public Peminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
        //this.buku = new Buku[jum];
    }

    public void addBuku(Buku b) {
        if (buku.length > nBuku) {
            buku[nBuku] = b;
            b.setStatus(true);
            nBuku++;
        } else {
            System.out.println("Jumlah Pinjaman Buku Kelebihan");
        }
    }
    
    public void removeBuku(int idx) {
        if ((idx < buku.length) && (idx >= 0)) {
           buku[idx].setStatus(false);
            buku[idx] = null;
            
            for (int j = idx; j < (buku.length-1); j++) {
                buku[j] = buku[j + 1];                
           }          
            nBuku--;
        //}
    }
}
    public Buku getBuku(int n) {
        if (n < nBuku) {
            return buku[n];
        } else {
            return null;
        }
    }

    public Buku getBuku(String idBuku) {
        Buku b = null;
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].getIdBuku().equals(idBuku)) {
                b = buku[i];
                break;
            }
        }
        return b;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public boolean getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(boolean statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }
    
    public int getNBuku() {
        return this.nBuku;
    }
}
