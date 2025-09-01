package edu.uph.m23si2.pertamaapp.model;

public class Student {
    private String nim;
    private String nama;
    private String prodi;
    private String email;
    private String alamat;

    static {
        System.out.println("Class Student dimuat ke memory!");
    }

    {
        System.out.println("Objek Student baru sedang dibuat...");
    }

    public Student(String nim, String nama, String prodi, String email, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public void printInfo() {
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Email  : " + email);
        System.out.println("Alamat : " + alamat);
    }
}
