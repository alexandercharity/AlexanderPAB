package edu.uph.m23si2.pertamaapp.model;

package edu.uph.m23si2.pertamaapp.model;

import java.util.ArrayList;
import java.util.List;

public class KRS {
    private String idKRS;
    private int semester;
    private Student mahasiswa;
    private List<KRSDetail> detailList;

    static {
        System.out.println("Class KRS dimuat ke memory!");
    }

    {
        detailList = new ArrayList<>();
        System.out.println("Objek KRS baru sedang dibuat...");
    }

    public KRS(String idKRS, int semester, Student mahasiswa) {
        this.idKRS = idKRS;
        this.semester = semester;
        this.mahasiswa = mahasiswa;
    }

    public String getIdKRS() { return idKRS; }
    public void setIdKRS(String idKRS) { this.idKRS = idKRS; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public Student getMahasiswa() { return mahasiswa; }
    public void setMahasiswa(Student mahasiswa) { this.mahasiswa = mahasiswa; }

    public List<KRSDetail> getDetailList() { return detailList; }
    public void addDetail(KRSDetail detail) {
        detailList.add(detail);
    }

    public void printInfo() {
        System.out.println("===== DATA KRS =====");
        System.out.println("ID KRS     : " + idKRS);
        System.out.println("Semester   : " + semester);
        if (mahasiswa != null) {
            mahasiswa.printInfo();
        }
        System.out.println("Jumlah MK  : " + detailList.size());
    }
}
{
}
