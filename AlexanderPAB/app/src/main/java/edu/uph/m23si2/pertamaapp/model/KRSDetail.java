package edu.uph.m23si2.pertamaapp.model;

public class KRSDetail {
    private String idDetail;
    private KelasMataKuliah mataKuliah;
    private String nilai;
    private boolean aktif;

    static {
        System.out.println("Class KRSDetail dimuat ke memory!");
    }

    {
        System.out.println("Objek KRSDetail baru sedang dibuat...");
    }

    public KRSDetail(String idDetail, KelasMataKuliah mataKuliah, String nilai, boolean aktif) {
        this.idDetail = idDetail;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
        this.aktif = aktif;
    }

    public String getIdDetail() { return idDetail; }
    public void setIdDetail(String idDetail) { this.idDetail = idDetail; }

    public KelasMataKuliah getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(KelasMataKuliah mataKuliah) { this.mataKuliah = mataKuliah; }

    public String getNilai() { return nilai; }
    public void setNilai(String nilai) { this.nilai = nilai; }

    public boolean isAktif() { return aktif; }
    public void setAktif(boolean aktif) { this.aktif = aktif; }

    public void printInfo() {
        System.out.println("===== DETAIL KRS =====");
        System.out.println("ID Detail : " + idDetail);
        if (mataKuliah != null) {
            mataKuliah.printInfo();
        }
        System.out.println("Nilai     : " + nilai);
        System.out.println("Aktif     : " + aktif);
    }
}
