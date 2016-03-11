/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisfo.perpustakaan;
import java.util.Date;

/**
 *
 * @author DK
 */
public class SisfoPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota a1 = new Anggota("111","38-04","IF",2014);
        a1.setNama("Acil");
        Anggota a2 = new Anggota("112","38-04","IF",2014);
        a2.setNama("Neneng");
        Anggota a3 = new Anggota("113","38-04","IF",2014);
        a3.setNama("Bryan");
        Buku b1 = new Buku("Buku PBO",true);
        Buku b2 = new Buku("Buku RPL",true);
        Buku b3 = new Buku("Buku MOSI",true);
        Buku b4 = new Buku("Buku Probstat",true);
        Buku b5 = new Buku("William Stalling",true);
        Buku b6 = new Buku("Roger Pressman",true);
        
       // a1.addPeminjaman(03/20/2016, 03/25/2016, 4);
        a1.addPeminjaman(1001,null,null,4);
        a2.addPeminjaman(1002,null,null,3);
        a3.addPeminjaman(1003,null,null,2);
        
        a1.getPeminjaman(0).addBuku(b1);
        a1.getPeminjaman(0).addBuku(b2);
        a1.getPeminjaman(0).addBuku(b3);
        a1.getPeminjaman(0).addBuku(b4);
        
        //a1.getPeminjaman(0).removeBuku(b4);
        
        a2.getPeminjaman(0).addBuku(b4);
        a2.getPeminjaman(0).addBuku(b5);
        a2.getPeminjaman(0).addBuku(b6);
        
        a3.getPeminjaman(0).addBuku(b4);
        a3.getPeminjaman(0).addBuku(b6);
        
        System.out.println("Peminjaman Perpustakaan:");
        for(int i=0; i<a1.getNPeminjaman(); i++){
            System.out.println("ID Peminjaman: "+a1.getPeminjaman(i).getIdPeminjaman());
            System.out.println("Nama Peminjam: "+a1.getNama());
            for(int j=0; j<a1.getPeminjaman(i).getNBuku(); j++){
                System.out.println("Buku "+(j+1)+": "+a1.getPeminjaman(i).getBuku(j).getJudul());
            }
        }
        for(int i=0; i<a2.getNPeminjaman(); i++){
            System.out.println("ID Peminjaman: "+a2.getPeminjaman(i).getIdPeminjaman());
            System.out.println("Nama Peminjam: "+a2.getNama());
            for(int j=0; j<a2.getPeminjaman(i).getNBuku(); j++){
                System.out.println("Buku "+(j+1)+": "+a2.getPeminjaman(i).getBuku(j).getJudul());
            }
        }
    }
    
}
