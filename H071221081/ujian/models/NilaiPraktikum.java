package ujian.models;

public class NilaiPraktikum extends Nilai {

    private int nilaiUjian;

    public NilaiPraktikum(MataKuliah mataKuliah, int nilaiTugas, int nilaiUjian) {
        super(mataKuliah, nilaiTugas);
        this.nilaiUjian = nilaiUjian;
    }

    public int getNilaiUjian() {
        return nilaiUjian;
    }

    public void setNilaiUjian(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    @Override
    public void showDetail(){
        System.out.println("nilai tugas : " + nilaiTugas);
        System.out.println("nilai ujian praktikum : " + nilaiUjian);
    }

}
