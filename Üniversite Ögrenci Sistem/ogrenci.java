package odev1;
//21100011040 hilal yayaset
public class ogrenci {
    private static int syc3 = 1;
    protected int bolno;
    private String ogrAd;
    private String ogrSoyad;

    public ogrenci(String ogrSoyad, String ogrAd, int bolNo) {
        this.bolno = bolNo;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
    }

    public ogrenci(String ogrAd, String ogrSoyad) {
        this.bolno = syc3++;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
    }

    public void yazdir() {
        System.out.println("Bölüm Numarası: " + bolno);
        System.out.println("Öğrenci Adı: " + ogrAd);
        System.out.println("Öğrenci Soyadı: " + ogrSoyad);
        
    }

    public int getBolno() {
        return bolno;
    }

    public void setBolno(int bolno) {
        this.bolno = bolno;
    }

    public String getOgrAd() {
        return ogrAd;
    }

    public void setOgrAd(String ogrAd) {
        this.ogrAd = ogrAd;
    }

    public String getOgrSoyad() {
        return ogrSoyad;
    }

    public void setOgrSoyad(String ogrSoyad) {
        this.ogrSoyad = ogrSoyad;
    }

}
