package odev1;
//21100011040 hilal yayaset
public class bolum {
    private static int syc = 1;
    private int bolno;
    private String bolad;
    private ogrenci ogrenciler[];  // ogrenci dizisi
    private ders dersler[];        // ders dizisi
    private ylogrenci ylOgrenciler[];  // yüksek lisans öğrencisi dizisi

    public bolum(int bolno, String bolad, ogrenci[] ogrenciler, ders[] dersler, ylogrenci[] ylOgrenciler) {
        this.bolno = syc++;
        this.bolad = bolad;
        this.ogrenciler = ogrenciler;
        this.dersler = dersler;
        this.ylOgrenciler = ylOgrenciler;
    }

    public bolum() {
        this.ogrenciler = new ogrenci[0];
        this.dersler = new ders[0];
        this.ylOgrenciler = new ylogrenci[0];
    }

    public void yazdir() {
        System.out.println("Bölüm Numarası: " + bolno);
        System.out.println("Bölüm Adı: " + bolad);
    }

    public int getBolno() {
        return bolno;
    }

    public void setBolno(int bolno) {
        this.bolno = bolno;
    }

    public String getBolad() {
        return bolad;
    }

    public void setBolad(String bolad) {
        this.bolad = bolad;
    }

    public ogrenci[] getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ogrenci[] ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public ders[] getDersler() {
        return dersler;
    }

    public void setDersler(ders[] dersler) {
        this.dersler = dersler;
    }

    public ylogrenci[] getYLOgrenciler() {
        return ylOgrenciler;
    }

    public void setYLOgrenciler(ylogrenci[] ylOgrenciler) {
        this.ylOgrenciler = ylOgrenciler;
    }
}
