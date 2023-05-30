package ujian.models;

public class Nilai {
    protected MataKuliah mataKuliah;
    protected int nilaiTugas;

    public Nilai(MataKuliah mataKuliah, int nilaiTugas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }


    public void showDetail(){
        System.out.println("nilai tugas : " + nilaiTugas);
    }
}
