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

            buku[idx] = null;
            for (int j = idx; j < buku.length; j++) {
                buku[idx] = buku[idx + 1];
            }
            buku[idx].setStatus(false);
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
    
    
}
