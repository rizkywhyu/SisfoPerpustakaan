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
    public class Buku {
    private String judul;
    private String pengarang;
    private int thnMasukBuku;
    private String tipe;
    private String idBuku;
    private boolean statusPinjam;
    
    public Buku(String judul, boolean statusPinjam){
        this.judul = judul;
        this.statusPinjam = statusPinjam;
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
    public void setStatus(boolean statusPinjam){
        this.statusPinjam = statusPinjam;
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
    public boolean getStatus(){
        return statusPinjam;
    }
    public void displayBuku(){
        System.out.println("ID Buku: "+ this.getIdBuku());
        System.out.println("Judul Buku: "+ this.getJudul());
        System.out.println("Pengarang Buku: "+ this.getPengarang());
        System.out.println("Tipe Buku: "+ this.getTipe());
        System.out.println("Tahun Buku: "+ this.getThnMasukBuku());
        if (this.getStatus() == true){
            System.out.println("Status Buku: Sedang Dipinjam");
        }else {
            System.out.println("Status Buku: Tidak Dipinjam");
        }
    }
}
