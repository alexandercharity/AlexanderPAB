package edu.uph.m23si2.pertamaapp.model;

public class KelasMataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private String dosen;

    static {
        System.out.println("Class KelasMataKuliah sudah dimuat ke memory!");
    }

    {
        System.out.println("Objek KelasMataKuliah baru sedang dibuat...");
    }

    public KelasMataKuliah(String kodeMK, String namaMK, int sks, String dosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public void printInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
        System.out.println("Dosen   : " + dosen);
    }
}
