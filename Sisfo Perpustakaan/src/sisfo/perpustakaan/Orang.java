
package sisfo.perpustakaan;

public abstract class Orang {
    private String nama;
    private String password;
    private String jenisKelamin;

    public Orang(){
        
    }
    public Orang(String nama, String password, String jenisKelamin){
        this.nama = nama;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    
}