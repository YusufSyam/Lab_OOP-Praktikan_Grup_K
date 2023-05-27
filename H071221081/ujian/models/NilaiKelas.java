package ujian.models;

public class NilaiKelas extends Nilai {

    private int nilaiPraktikum;

    public NilaiKelas(MataKuliah mataKuliah, int nilaiTugas, int nilaiPraktikum) {
        super(mataKuliah, nilaiTugas);
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public int getNilaiPraktikumnilaiPraktikum() {
        return nilaiPraktikum;
    }

    public void setNilaiPraktikumnilaiPraktikum(int nilaiPraktikum) {
        this.nilaiPraktikum = nilaiPraktikum;
    }

    @Override
    public void showDetail() {
        System.out.println("nilai tugas : " + nilaiTugas);
        System.out.println("nilai final : " + nilaiPraktikum);
    }
}
