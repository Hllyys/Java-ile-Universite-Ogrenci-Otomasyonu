package odev1;
//21100011040 hilal yayaset
import java.util.Scanner;

public class anasayfa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane bölüm olacak? ");
        int bolum_sayisi = scanner.nextInt();
        scanner.nextLine(); 

        bolum[] bolumler = new bolum[bolum_sayisi];
        // Bölüm bilgilerini kullanıcıdan alıp ve diziye ekleme
        for (int i = 0; i < bolum_sayisi; i++) {
            bolum bolum = new bolum();

            System.out.print("Bölüm no giriniz: ");
            int bolNo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Bölüm adı giriniz: ");
            String bolAd = scanner.nextLine();

            System.out.print(" lisans öğrenci sayisi ");
            int lisans_ogrenci_sayisi = scanner.nextInt();
            scanner.nextLine();

            lisansogrencisi[] lisansOgrenciler = new lisansogrencisi[lisans_ogrenci_sayisi];
            //lisans bilgilerini alıp diziye ekleme
            for (int j = 0; j < lisans_ogrenci_sayisi; j++) {
                System.out.print("Öğrenci adı giriniz: ");
                String ogrAd = scanner.nextLine();

                System.out.print("Öğrenci soyadı giriniz: ");
                String ogrSoyad = scanner.nextLine();

                System.out.print("Sınıf giriniz: ");
                int sinif = scanner.nextInt();
                scanner.nextLine(); 

                lisansOgrenciler[j] = new lisansogrencisi(ogrSoyad, ogrAd, bolNo, sinif, "x");//"x" ögrencinin durumunu belirtmek için
            }

            System.out.print("yüksek lisans öğrencisi sayisi? ");
            int yl_ogrenci_sayisi = scanner.nextInt();
            scanner.nextLine(); 

            ylogrenci[] ylOgrenciler = new ylogrenci[yl_ogrenci_sayisi];
            //yükesek lisans bilgilerini alıp diziye ekleme
            for (int j = 0; j < yl_ogrenci_sayisi; j++) {
                System.out.print("Yüksek Lisans Öğrenci Adı: ");
                String ogrAd = scanner.nextLine();

                System.out.print("Yüksek Lisans Öğrenci Soyadı: ");
                String ogrSoyad = scanner.nextLine();

                ylOgrenciler[j] = new ylogrenci(ogrSoyad, ogrAd, bolNo, "x");
            }

            System.out.print("Kaç tane ders var? ");
            int ders_sayisi = scanner.nextInt();
            scanner.nextLine();

            ders[] dersler = new ders[ders_sayisi];
            //ders bilgilerini alip diziye ekleme
            for (int k = 0; k < ders_sayisi; k++) {
                System.out.print("Ders adı giriniz: ");
                String dersAd = scanner.nextLine();

                System.out.print("Ders kredisi giriniz: ");
                int dersKredi = scanner.nextInt();
                scanner.nextLine(); 

                dersler[k] = new ders(bolNo, dersKredi, dersAd, dersKredi);
            }

            // Bölümü bolumler dizisine ekleme
            bolum.setBolno(bolNo);
            bolum.setBolad(bolAd);
            bolum.setOgrenciler(lisansOgrenciler);
            bolum.setYLOgrenciler(ylOgrenciler);
            bolum.setDersler(dersler);
            bolumler[i] = bolum;
        }

        int secim;
        do {
            System.out.println("\n------------------MENÜ---------------");
            System.out.println("1- Tüm Bölümlerin Bilgilerini Listele");
            System.out.println("2- Lisans Öğrencilerini Listele");
            System.out.println("3- Yüksek Lisans Öğrencilerini Listele");
            System.out.println("4- Dersleri Listele");
            System.out.println("5- Arama Yap");
            System.out.println("6- Çıkış");

            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                	for (int i = 0; i < bolum_sayisi; i++) {
                        if (bolumler[i] != null) {
                            System.out.println("------------------");
                            bolumler[i].yazdir();

                            int lisans_ogrenci_sayisi = bolumler[i].getOgrenciler().length;
                            lisansogrencisi[] lisansOgrenciler = (lisansogrencisi[]) bolumler[i].getOgrenciler();
                            //lisans
                            for (int j = 0; j < lisans_ogrenci_sayisi; j++) {
                                System.out.print(j + 1 + ". Öğrenci:\n ");
                                lisansOgrenciler[j].yazdir();
                            }
                            //yüksek lisans
                            int yl_ogrenci_sayisi = bolumler[i].getYLOgrenciler().length;
                            ylogrenci[] ylOgrenciler = bolumler[i].getYLOgrenciler();

                            for (int k = 0; k < yl_ogrenci_sayisi; k++) {
                                System.out.print(k + 1 + ". Öğrenci: \n");
                                ylOgrenciler[k].yazdir();
                            }

                            System.out.println("Dersler: ");
                            //dersler
                            for (int a = 0; a < bolumler[i].getDersler().length; a++) {
                                System.out.print(a + 1 + ". Ders:\n ");
                                bolumler[i].getDersler()[a].ders_yazdir();
                            }
                        } else {
                            System.out.println("Bölüm bulunamadı.");
                        }
                    }
                    break;
                case 2:
                	  for (int i = 0; i < bolum_sayisi; i++) {
                              int lisans_ogrenci_sayisi = bolumler[i].getOgrenciler().length;
                            
                              lisansogrencisi[] lisansOgrenciler = (lisansogrencisi[]) bolumler[i].getOgrenciler();

                              for (int j = 0; j < lisans_ogrenci_sayisi; j++) {
                                  System.out.print(j + 1 + ". Öğrenci:\n ");
                                  lisansOgrenciler[j].yazdir();
                              }
                      }
                	break;
                case 3:
                	  for (int i = 0; i < bolum_sayisi; i++) {
                          
                              int yl_ogrenci_sayisi = bolumler[i].getYLOgrenciler().length;
                         
                              ylogrenci[] ylOgrenciler = bolumler[i].getYLOgrenciler();

                              for (int j = 0; j < yl_ogrenci_sayisi; j++) {
                                  System.out.print( + 1 + ". Öğrenci: \n");
                                  ylOgrenciler[j].yazdir();
                              }
                      }
                    break;

                case 4:
                	  for (int i = 0; i < bolum_sayisi; i++) {
                       
                              System.out.println("Dersler: ");
                              for (int j = 0; j < bolumler[i].getDersler().length; j++) {
                                  System.out.print(j + 1 + ". Ders:\n ");
                                  bolumler[i].getDersler()[j].ders_yazdir();
                              }
                	  }
                    break;

                
                case 5:
                	boolean durum = false;
                	System.out.print("Aramak istediğiniz kelimeyi giriniz: ");
                	String aranacak = scanner.next();

                	// Öğrenci arama
                	
                	for (int i = 0; i < bolum_sayisi; i++) {
                	    int lisans_ogrenci_sayisi = bolumler[i].getOgrenciler().length;
                	    lisansogrencisi[] lisansOgrenciler = (lisansogrencisi[]) bolumler[i].getOgrenciler();

                	    for (int j = 0; j < lisans_ogrenci_sayisi; j++) {//aranan deger ad, soyad ile eşleşiyorsa if bloğununn içine girer
                	        if (lisansOgrenciler[j].getOgrAd().contains(aranacak) || lisansOgrenciler[j].getOgrSoyad().contains(aranacak)) {
                	        	durum = true;
                	            System.out.print("Bölüm:\n " + bolumler[i].getBolad() + " ");
                	            lisansOgrenciler[j].yazdir();
                	        }
                	    }

                	    int yl_ogrenci_sayisi = bolumler[i].getYLOgrenciler().length;
                	    ylogrenci[] ylOgrenciler = bolumler[i].getYLOgrenciler();

                	    for (int k = 0; k < yl_ogrenci_sayisi; k++) {//aranan deger ad, soyad ile eşleşiyorsa if bloğununn içine girer
                	        if (ylOgrenciler[k].getOgrAd().contains(aranacak) || ylOgrenciler[k].getOgrSoyad().contains(aranacak)) {
                	        	durum = true;
                	            System.out.print("Bölüm:\n " + bolumler[i].getBolad() + " ");
                	            ylOgrenciler[k].yazdir();
                	        }
                	    }
                	}

                	//ders arama
                	for (int i = 0; i < bolum_sayisi; i++) {
                	    int ders_sayisi = bolumler[i].getDersler().length;
                	    ders[] dersler = bolumler[i].getDersler();

                	    for (int y = 0; y < ders_sayisi; y++) {//aranan deger ad ile eşleşiyorsa if bloğununn içine girer
                	        if (dersler[y].getDersAd().contains(aranacak)) {
                	        	durum = true;
                	            System.out.println("Bölüm:\n " + bolumler[i].getBolad());
                	            System.out.print(y + 1 + ". Ders: \n");
                	            dersler[y].ders_yazdir();
                	        }
                	    }
                	}

                	if (!durum) {
                	    System.out.println("Aranan kelime bulunamadı.");
                	}
                	break;
                case 6:
                    System.out.println("çıkış");
                    break;
                default:
                    System.out.println("Geçersiz seçim");
            }

        } while (secim != 5);

        scanner.close();
    }
}
