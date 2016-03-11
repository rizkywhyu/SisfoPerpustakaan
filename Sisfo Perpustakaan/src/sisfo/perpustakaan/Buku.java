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
    public class Buku {
    private String judul;
    private String pengarang;
    private int thnMasukBuku;
    private String tipe;
    private String idBuku;
    private boolean status;
    
    public Buku(String judul, boolean status){
        this.judul = judul;
        this.status = status;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setTahunMasukBuku(int thnMasukBuku){
        this.thnMasukBuku = thnMasukBuku;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public void setIdBuku(String idBuku){
        this.idBuku = idBuku;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public int getThnMasukBuku(){
        return thnMasukBuku;
    }
    public String getTipe(){
        return tipe;
    }
    public String getIdBuku(){
        return idBuku;
    }
    
}
