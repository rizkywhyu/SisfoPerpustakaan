/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Petugas extends Orang{
    private long id;
    private int nPeminjaman;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private int nBuku;
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public Petugas(){
        super();
    }
    public Petugas(String nama, String password, String jenisKelamin, long id){
        super(nama, password, jenisKelamin);
        this.id=id;
    }
    public void setId(int id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    
    public void addPeminjaman(Peminjaman pe){
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
        daftarPeminjaman.add(pe);
        daftarPeminjaman.size();
//        if (nPeminjaman<10){
//            peminjaman[nPeminjaman] = new Peminjaman(idPeminjaman, jum);
//            nPeminjaman++;
//        }else {
//            System.out.println("Hanya boleh meminjam maksimal 10 buku");
//        }
    }
    
    public Peminjaman getPeminjaman(int n){
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.getIdPeminjaman() == n){
                return peminjaman;
            } else {
                return null;
            }
        }
        return null;
    }
	
    public int getNPeminjaman(){
            return nPeminjaman;
    }
    
    public void changeStatusPeminjaman(Anggota a, long n){
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.getIdPeminjaman() == n) {
                    if (a.getPeminjaman(n).getStatusPeminjaman() == false){
                    a.getPeminjaman(n).setStatusPeminjaman(true);
                } else if (a.getPeminjaman(n).getStatusPeminjaman() == true){
                    a.getPeminjaman(n).setStatusPeminjaman(false);
                }
            }
        }
        
    }
    
    @Override
    public String toString() {
        String info = "";
        info += "Nama: "+ super.getNama() +"\n";
        info += "ID Petugas: "+ this.getId()+"\n";
        info += "Jenis Kelamin: "+ super.getJenisKelamin()+"\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }
    
     public String getQuote(String masuk) {
        return "'" + masuk + "'";
    }

    public ResultSet LoginStaff(String u, String p) {
        database db = new database();
        String SQLString = "SELECT * from staff where username= " + getQuote(u) + " AND password = " + getQuote(p) + ";";
        return db.getData(SQLString);
    }
}