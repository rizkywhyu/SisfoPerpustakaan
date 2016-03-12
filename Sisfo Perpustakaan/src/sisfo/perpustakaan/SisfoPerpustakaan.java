/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;


/**
 *
 * @author DK
 */
public class SisfoPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota a = null;
        Buku[] buku = new Buku[1000];
        Anggota a1 = new Anggota("111", "38-04", "IF", 2014);
        a1.setNama("Acil");
        Anggota a2 = new Anggota("112", "38-04", "IF", 2014);
        a2.setNama("Neneng");
        Anggota a3 = new Anggota("113", "38-04", "IF", 2014);
        a3.setNama("Bryan");

        Buku b1 = new Buku("Buku PBO", true);
        Buku b2 = new Buku("Buku RPL", true);
        Buku b3 = new Buku("Buku MOSI", true);
        Buku b4 = new Buku("Buku Probstat", true);
        Buku b5 = new Buku("William Stalling", true);
        Buku b6 = new Buku("Roger Pressman", true);
        
        b1.displayBuku();
        // a1.addPeminjaman(03/20/2016, 03/25/2016, 4);
        a1.addPeminjaman(1001, 4);
        a1.addPeminjaman(1101, 1);
        a2.addPeminjaman(1002, 3);
        a3.addPeminjaman(1003, 2);

        a1.getPeminjaman(0).addBuku(b1);
        a1.getPeminjaman(0).addBuku(b2);
        a1.getPeminjaman(0).addBuku(b3);
        a1.getPeminjaman(0).addBuku(b4);
        a1.getPeminjaman(1).addBuku(b6);

        a2.getPeminjaman(0).addBuku(b4);
        a2.getPeminjaman(0).addBuku(b5);
        a2.getPeminjaman(0).addBuku(b6);

        a3.getPeminjaman(0).addBuku(b4);
        a3.getPeminjaman(0).addBuku(b6);

        a1.displayPinjaman();
        System.out.println("");
        a2.displayPinjaman();
        System.out.println("");
        a3.displayPinjaman();
        System.out.println("");
        
        a1.getPeminjaman(0).removeBuku(1);
        a1.getPeminjaman(0).removeBuku(2);

        
        

        System.out.println("Nama Peminjam: " + a1.getNama());
        for (int k = 0; k < a1.getNPeminjaman(); k++) {
            System.out.println("Peminjaman " + (k + 1) + ":");
            System.out.println("ID Peminjaman: " + a1.getPeminjaman(k).getIdPeminjaman());
            if (buku.length < a1.getPeminjaman(k).getNBuku()) {
                System.out.println("Semua Buku Telah Dikembalikan");
            } else {
                for (int l = 0; l < a1.getPeminjaman(k).getNBuku(); l++) {
                    System.out.println("Buku " + (l + 1) + ": " + a1.getPeminjaman(k).getBuku(l).getJudul());
                }
            }

        }
        
        b2.displayBuku();        
       
    }

}
