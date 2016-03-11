/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;
import java.util.Date;
/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    private int idPeminjaman;
    private Date tglPeminjaman;
    private Date tglPengembalian;
    private double denda;
    private Buku[] buku = new Buku[1000];
    private int nBuku;
    private Anggota peminjam;
    private boolean statusPinjam;
    
    public Peminjaman (int idPeminjaman, Date tglPeminjaman, Date tglPemgembalian, int jum){
        this.idPeminjaman = idPeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.tglPengembalian = tglPengembalian;
        this.buku = new Buku[jum];
    }
    
    public Peminjaman (int idPeminjaman, int jum){
        this.idPeminjaman = idPeminjaman;
        this.buku = new Buku[jum];
    }
    
    public void addBuku(Buku b){
        if (buku.length>nBuku){
			buku[nBuku] = b;
			nBuku++;
		} else {
			System.out.println("Perpustakaan sudah penuh");
		}
    }
    
    public boolean removeBuku(Buku b){
            for (int j=0; j<nBuku; j++){
                if (b == buku[j])
                    break;
                if (j == nBuku)
                    return false;
                
                else{
                    for (int k = j; k<nBuku; k++){
                        buku[k] = buku[k+1];
                        nBuku--;
                    }
                }
            }
        return true;
        
        //oldi version
        
        /*if ( i> b.length) && (i<0){
            b[i] = null;
            System.out.println("Buku terhapus");
        }else {
                System.out.println("Buku tidak dapat dihapus");
                }
        */
    }
    
    
    public Buku getBuku(int n){
        if (n<nBuku){
            return buku[n];
        }else{
            return null;
        }
        
    }

    public Date getTglPeminjaman() {
        return tglPeminjaman;
    }

    public void setTglPeminjaman(Date tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman;
    }

    public Date getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }
    
    
    public int getNBuku(){
        return this.nBuku;
    }
}
