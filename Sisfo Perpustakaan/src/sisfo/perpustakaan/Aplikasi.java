package sisfo.perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rizky
 */
public class Aplikasi {

    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    Petugas petugas, p;
    Anggota anggota, a;
    Peminjaman peminjaman;
    Buku buku;
    private int nAnggota;
    private int nBuku;
    private int nPetugas;
    private int jumBuku;
    private long idPeminjaman;
    Scanner input = new Scanner(System.in);
    int pilih, thnMasuk, thnMasukBuku;
    String nama, password, jenisKelamin, nim, kelas, jurusan, judul, pengarang, tipe, idBuku;
    long id;
    boolean statusPinjam;

    public void addPetugas(String nama, String password, String jenisKelamin, long id) {
        Petugas p = new Petugas(nama, password, jenisKelamin, id);
        daftarPetugas.add(p);
//        if (daftarPetugas.length > nPetugas) {
//            daftarPetugas[nPetugas] = new Petugas(nama, password, jenisKelamin, id);
//            nPetugas++;
//        } else {
//            System.out.println("Jumlah Petugas Kelebihan");
//        }
    }

    public void addAnggota(String nama, String password, String jenisKelamin, String nim, String kelas, String jurusan, int thnMasuk) {
        Anggota a = new Anggota(nama, password, jenisKelamin, nim, kelas, jurusan, thnMasuk);
        daftarAnggota.add(a);
//        if (daftarAnggota.length > nAnggota) {
//            daftarAnggota[nAnggota] = new Anggota(nama, password, jenisKelamin, nim, kelas, jurusan, thnMasuk);
//            nAnggota++;
//        } else {
//            System.out.println("Jumlah Anggota Kelebihan");
//        }
    }

    public void addBuku(String judul, String pengarang, int thnMasukBuku, String tipe, String idBuku, boolean statusPinjam) {
        Buku b = new Buku(judul, pengarang, thnMasukBuku, tipe, idBuku, statusPinjam);
        daftarBuku.add(b);
//        if (daftarBuku.length > nBuku) {
//            daftarBuku[nBuku] = new Buku(judul, pengarang, thnMasukBuku, tipe, idBuku, statusPinjam);
//            nBuku++;
//        } else {
//            System.out.println("Jumlah Buku Kelebihan");
//        }
    }

    public Peminjaman createPeminjaman(long idPeminjaman) {
        Peminjaman pe = new Peminjaman(idPeminjaman);
        daftarPeminjaman.add(pe);
        return pe;
//        if (nPeminjaman<10){
//            peminjaman[nPeminjaman] = new Peminjaman(idPeminjaman, jum);
//            nPeminjaman++;
//        }else {
//            System.out.println("Hanya boleh meminjam maksimal 10 buku");
//        }
    }

//    public Anggota getAnggota(int a){
//        if (a < nBuku) {
//            return daftarAnggota[a];
//        } else {
//            return null;
//        }
//    }
    public void deleteAnggota(Anggota a) {
        daftarAnggota.remove(a);
    }

    public void deletePetugas(Petugas p) {
        daftarPetugas.remove(p);
    }

    public void deleteBuku(Buku b) {
        daftarBuku.remove(b);
    }

    public void deletePeminjaman(Peminjaman pe) {
        daftarPeminjaman.remove(pe);
    }

    public void menuSatu() {
        try {
            System.out.println("PENGELOLAAN PETUGAS");
            System.out.println("1. Tambah Data Petugas");
            System.out.println("2. Hapus Data Petugas");
            System.out.println("3. Lihat Semua Data Petugas");
            System.out.println("4. Cari Data Petugas");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = input.next();
                    System.out.print("Masukkan Password: ");
                    password = input.next();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    jenisKelamin = input.next();
                    System.out.print("Masukkan ID Petugas: ");
                    id = input.nextLong();
                    addPetugas(nama, password, jenisKelamin, id);
                    menuSatu();
                    break;

                case 2:
                    System.out.print("Masukkan ID Petugas: ");
                    id = input.nextLong();
//                for (int i = 0; i < daftarPetugas.size(); i++){
//                    if (daftarPetugas.get == id)
//                }

                    for (Petugas petugas : daftarPetugas) {
                        if (petugas.getId() == id) {
                            deletePetugas(petugas);
                            System.out.println("Petugas Telah Terhapus");
                            break;
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuSatu();
                    break;
                case 3:
                    for (int i = 0; i < (daftarPetugas.size()); i++) {
                        System.out.println(daftarPetugas.get(i));
                    }
                    menuSatu();
                    break;
                case 4:
                    System.out.println("Masukkan ID Petugas yang Akan Dicari: ");
                    id = input.nextLong();
                    for (Petugas petugas : daftarPetugas) {
                        if (petugas.getId() == id) {
                            System.out.println(petugas);
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuSatu();
                    break;
                case 5:
                    mainMenu();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Inputan salah");
        }

    }

    public void menuDua() {
        try {
            System.out.println("PENGELOLAAN ANGGOTA");
            System.out.println("1. Tambah Data Anggota");
            System.out.println("2. Hapus Data Anggota");
            System.out.println("3. Lihat Semua Data Anggota");
            System.out.println("4. Cari Data Petugas");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = input.next();
                    System.out.print("Masukkan Password: ");
                    password = input.next();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    jenisKelamin = input.next();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = input.next();
                    System.out.print("Masukkan Kelas: ");
                    kelas = input.next();
                    System.out.print("Masukkan Jurusan: ");
                    jurusan = input.next();
                    System.out.print("Masukkan Tahun Masuk: ");
                    thnMasuk = input.nextInt();

                    addAnggota(nama, password, jenisKelamin, nim, kelas, jurusan, thnMasuk);
                    menuDua();
                    break;
                case 2:
                    System.out.print("Masukkan Nim Anggota: ");
                    nim = input.next();
//                for (int i = 0; i < daftarPetugas.size(); i++){
//                    if (daftarPetugas.get == id)
//                }

                    for (Anggota anggota : daftarAnggota) {
                        if (anggota.getNim() == nim) {
                            deleteAnggota(anggota);
                            System.out.println("Anggotas Telah Terhapus");
                            break;
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuDua();
                    break;
                case 3:
                    for (int i = 0; i < (daftarAnggota.size()); i++) {
                        System.out.println(daftarAnggota.get(i));
                    }
                    menuDua();
                    break;
                case 4:
                    System.out.println("Masukkan NIM Anggota yang Akan Dicari: ");
                    nim = input.next();
                    for (Anggota angota : daftarAnggota) {
                        if (anggota.getNim() == nim) {
                            System.out.println(anggota);
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuDua();
                    break;
                case 5:
                    mainMenu();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Inputan Salah, Silahkan Coba lagi");
        }

    }

    public void menuTiga() {
        try {
            System.out.println("PENGELOLAAN BUKU");
            System.out.println("1. Tambah Data Buku");
            System.out.println("2. Hapus Data Buku");
            System.out.println("3. Lihat Semua Data Buku");
            System.out.println("4. Cari Data Petugas");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    judul = input.next();
                    System.out.print("Masukkan Pengarang: ");
                    pengarang = input.next();
                    System.out.print("Masukkan Tahun Masuk: ");
                    thnMasukBuku = input.nextInt();
                    System.out.print("Masukkan Tipe Buku: ");
                    tipe = input.next();
                    System.out.print("Masukkan ID Buku: ");
                    idBuku = input.next();
                    System.out.print("Masukkan Status Pinjam: ");
                    statusPinjam = input.nextBoolean();
                    addBuku(judul, pengarang, thnMasukBuku, tipe, idBuku, statusPinjam);
                    menuTiga();
                    break;
                case 2:
                    System.out.print("Masukkan ID Buku: ");
                    idBuku = input.next();
//                for (int i = 0; i < daftarPetugas.size(); i++){
//                    if (daftarPetugas.get == id)
//                }

                    for (Buku buku : daftarBuku) {
                        if (buku.getIdBuku() == idBuku) {
                            deleteBuku(buku);
                            System.out.println("Buku Telah Terhapus");
                            break;
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuTiga();
                    break;
                case 3:
                    for (int i = 0; i < (daftarBuku.size()); i++) {
                        System.out.println(daftarBuku.get(i));
                    }
                    menuTiga();
                    break;
                case 4:
                    System.out.println("Masukkan ID Buku yang Akan Dicari: ");
                    idBuku = input.next();
                    for (Buku buku : daftarBuku) {
                        if (buku.getIdBuku() == idBuku) {
                            System.out.println(buku);
                        } else {
                            System.out.println("data tidak ditemukan");
                        }
                    }
                    menuTiga();
                    break;
                case 5:
                    mainMenu();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Inputan Salah, Silahkan Coba lagi");
        }

    }

    public void menuEmpat() {
        try {
            System.out.println("PENGELOLAAN PEMINJAMAN");
        System.out.println("1. Tambah Data Peminjaman");
        System.out.println("2. Hapus Data Peminjaman (Pengembalian)");
        System.out.println("3. Lihat Semua Data Peminjaman");
        System.out.println("4. Cari Data Peminjaman");
        System.out.println("5. Kembali");
        System.out.print("Masukkan Pilihan: ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan ID Peminjaman: ");
                idPeminjaman = input.nextLong();

                peminjaman = createPeminjaman(idPeminjaman);

                System.out.print("ID Petugas: ");
                id = input.nextLong();
                for (Petugas petugas : daftarPetugas) {
                    if (petugas.getId() == id) {
                        p = petugas;
                        break;
                    }
                }
                System.out.print("NIM Anggota: ");
                nim = input.next();
                for (Anggota anggota : daftarAnggota) {
                    if (anggota.getNim().equals(nim)) {
                        a = anggota;
                        break;
                    }
                }
                a.addPeminjaman(peminjaman);
                System.out.print("Jumlah Buku yang Dipinjam: ");
                jumBuku = input.nextInt();
                for (int i = 0; i < jumBuku; i++) {
                    System.out.print("ID Buku-" + (i + 1) + " ");
                    idBuku = input.next();
                    for (Buku buku : daftarBuku) {
                        if (buku.getIdBuku().equals(idBuku)) {
                            a.getPeminjaman(idPeminjaman).tambahBuku(buku);
                        }
                    }
                }

                p.changeStatusPeminjaman(a, idPeminjaman);
                menuEmpat();
                break;
            case 2:
                System.out.print("Masukkan ID Peminjaman: ");
                idPeminjaman = input.nextLong();
                for (Peminjaman peminjaman : daftarPeminjaman) {
                    if (peminjaman.getIdPeminjaman() == idPeminjaman) {
                        deletePeminjaman(peminjaman);
                        System.out.println("Peminjaman Telah Terhapus");
                        break;
                    } else {
                        System.out.println("data tidak ditemukan");
                    }
                }
                menuEmpat();
                break;
            case 3:
                for (int i = 0; i < (daftarPeminjaman.size()); i++) {
                    System.out.println(daftarPeminjaman.get(i));
                }
                menuEmpat();
                break;
            case 4:
                System.out.println("Masukkan ID Peminjaman yang Akan Dicari: ");
                idPeminjaman = input.nextInt();
                for (Peminjaman peminjaman : daftarPeminjaman) {
                    if (peminjaman.getIdPeminjaman() == idPeminjaman) {
                        System.out.println(peminjaman);
                    } else {
                        System.out.println("data tidak ditemukan");
                    }
                }
                menuEmpat();
                break;
            case 5:
                mainMenu();
                break;
        }
        } catch (Exception e) {
            System.out.println("Inputan Salah,Silahkan COba Lagi");
        }
        
    }

    public void menuLima() {

    }

    public void mainMenu() {
        System.out.println("SISTEM INFORMASI PERPUSTAKAAN PBO 4 BERJAYA");
        System.out.println("");
        System.out.println("Daftar menu: ");
        System.out.println("1. Pengelolaan Petugas");
        System.out.println("2. Pengelolaan Anggota");
        System.out.println("3. Pengelolaan Buku");
        System.out.println("4. Pengelolaan Peminjaman");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Pilihan: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                menuSatu();

                break;
            case 2:
                menuDua();
                break;
            case 3:
                menuTiga();
                break;
            case 4:
                menuEmpat();
                break;
            case 5:
                menuLima();
                break;
        }
    }

}
