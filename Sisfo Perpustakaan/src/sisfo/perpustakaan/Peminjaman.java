/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;

import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Peminjaman {

    private long idPeminjaman;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    private int nBuku;
    private Anggota peminjam;
    private boolean statusPeminjaman;

    public Peminjaman(long idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }
    
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
        daftarBuku.size();
        b.setStatus(true);
//        if (buku.length > nBuku) {
//            buku[nBuku] = b;
//            b.setStatus(true);
//            nBuku++;
//        } else {
//            System.out.println("Jumlah Pinjaman Buku Kelebihan");
//        }
    }

   public void tambahAnggota(Anggota a){
       daftarAnggota.add(a);
        daftarAnggota.size();
//        if (anggota.length > nAnggota) {
//            anggota[nAnggota] = a;
//            nAnggota++;
//        } else {
//            System.out.println("Jumlah Anggota Kelebihan");
//        }
    }
   
   public void tambahPetugas(Petugas p){
       
        daftarPetugas.add(p);
        daftarPetugas.size();
//        if (petugas.length > nPetugas) {
//            petugas[nPetugas] = p;
//            nPetugas++;
//        } else {
//            System.out.println("Jumlah Petugas Kelebihan");
//        }
    }
   
   public void hapusAnggota(Anggota a){
       ArrayList<Anggota> daftarAnggota = new ArrayList<>();
        daftarAnggota.remove(a);
//        if ((idxAnggota < anggota.length) && (idxAnggota >= 0)) {
//            anggota[idxAnggota] = null;
//            
//            for (int j = idxAnggota; j < (anggota.length-1); j++) {
//                anggota[j] = anggota[j + 1];                
//           }          
//            nAnggota--;
//        }
    }
    
    public void hapusPetugas(Petugas p){
        ArrayList<Petugas> daftarPetugas = new ArrayList<>();
        daftarPetugas.remove(p);
//        if ((idxPetugas < petugas.length) && (idxPetugas >= 0)) {
//            petugas[idxPetugas] = null;
//            
//            for (int j = idxPetugas; j < (petugas.length-1); j++) {
//                petugas[j] = petugas[j + 1];                
//           }          
//            nPetugas--;
//        }
    }
    
    public void hapusBuku(Buku b) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.remove(b);
        b.setStatus(false);
//        if ((idx < buku.length) && (idx >= 0)) {
//           buku[idx].setStatus(false);
//            buku[idx] = null;
//            
//            for (int j = idx; j < (buku.length-1); j++) {
//                buku[j] = buku[j + 1];                
//           }          
//            nBuku--;
//        //}
//    }
}
    public Buku getBuku(int n) {
        if (n < daftarBuku.size()) {
            return daftarBuku.get(n);
        } else {
            return null;
        }
    }

    public Buku getBuku(String idBuku) {
        Buku b = null;
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getIdBuku().equals(idBuku)) {
                b =daftarBuku.get(i);
                break;
            }
        }
        return b;
    }

    public long getIdPeminjaman() {
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
    
    @Override
    public String toString() {
        String info = "";
        info += "ID Peminjaman: "+ this.getIdPeminjaman() +"\n";
        info += "Jumlah Buku yang Dipinjam: "+daftarBuku.size()+"\n";
        for (int i = 0; i<daftarBuku.size();i++){
            info += "Buku "+(i+1)+": " + this.getBuku(i);
        }
        info += "Status Peminjaman: "+ this.getStatusPeminjaman() +"\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }
}