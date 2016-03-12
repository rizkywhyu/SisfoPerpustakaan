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
public class Petugas extends Orang{
    private long id;
    private Peminjaman[] peminjaman = new Peminjaman[100];
    private int nPeminjaman;
    private Buku[] buku = new Buku[1000];
    private int nBuku;
    
    public Petugas(long id){
        this.id=id;
    }
    public void setId(int id){
        this.id = id;
    }
    public long getId(){
        return id;
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
        }

    }
    
    
    public void addPeminjaman(int idPeminjaman, int jum){
        if (nPeminjaman<10){
            peminjaman[nPeminjaman] = new Peminjaman(idPeminjaman, jum);
            nPeminjaman++;
        }else {
            System.out.println("Hanya boleh meminjam maksimal 10 buku");
        }
    }
    
    public Peminjaman getPeminjaman(int n){
        if (n<100){
                return peminjaman[n];
        } else {
                return null;
        }
    }
	
    public int getNPeminjaman(){
            return nPeminjaman;
    }
    
    public void changeStatusPeminjaman(Anggota a, int n){
        if (a.getPeminjaman(n).getStatusPeminjaman() == false){
            a.getPeminjaman(n).setStatusPeminjaman(true);
        } else if (a.getPeminjaman(n).getStatusPeminjaman() == true){
            a.getPeminjaman(n).setStatusPeminjaman(false);
        }
    }
}
