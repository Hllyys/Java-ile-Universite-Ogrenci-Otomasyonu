package odev1;
//21100011040 hilal yayaset
public class lisansogrencisi extends ogrenci {
    private static int syc4 = 1;
    private int ogr_id;
    private int ogr_sinif;
    private String durum;

    public lisansogrencisi(String ogrSoyad, String ogrAd, int bolNo, int ogr_sinif, String durum) {
        super(ogrSoyad, ogrAd, bolNo);
        this.ogr_id = syc4++;
        this.ogr_sinif = ogr_sinif;
        this.durum = "lisans";
    }

    public void lisans_yazdir() {
        System.out.println("Lisans Öğrencisi Bilgileri:");
        System.out.println("Öğrenci ID: " + this.ogr_id);
        System.out.println("Öğrenci Adı: " + getOgrAd());
        System.out.println("Öğrenci Soyadı: " + getOgrSoyad());
        System.out.println("Sınıf: " + this.ogr_sinif);
        
    }
}
