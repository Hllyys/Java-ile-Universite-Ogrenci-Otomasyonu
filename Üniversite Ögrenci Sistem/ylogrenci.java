package odev1;
//21100011040 hilal yayaset
public class ylogrenci extends ogrenci {
    private static int syc5 = 1;
    private int ogr_id;
    private String durum;

    public ylogrenci(String ogrSoyad, String ogrAd, int bolNo, String durum) {
        super(ogrSoyad, ogrAd, bolNo);
        this.ogr_id = syc5++;
        this.durum = "yüksek lisans ogrenci";
    }

    public void yl_yazdir() {
        System.out.println("Yüksek Lisans Öğrencisi Bilgileri:");
        System.out.println("Öğrenci ID: " + this.ogr_id);
        System.out.println("Öğrenci Adı: " + getOgrAd());
        System.out.println("Öğrenci Soyadı: " + getOgrSoyad());
        System.out.println("Bölüm No: " + bolno); 
        System.out.println("Durum: " + this.durum);
    }
}