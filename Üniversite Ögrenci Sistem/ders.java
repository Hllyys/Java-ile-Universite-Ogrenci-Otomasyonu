package odev1;
//21100011040 hilal yayaset
public class ders  extends bolum{
	private static int syc2=1;
	private int bolno;
	private int dersID;
	private String dersAd;
	private int dersKredi;
	public ders(int bolno, int dersID, String dersAd, int dersKredi) {
		super();
		this.dersID = syc2++;
		this.dersAd = dersAd;
		this.dersKredi = dersKredi;
	}
	public ders() {
		
	}
	
	
	public void ders_yazdir()
	{
		 System.out.println("Ders ID: " + dersID);
	     System.out.println("Ders Adı: " + dersAd);
	     System.out.println("Ders Kredisi: " + dersKredi);
	}
	
	public int getDersID() {
		return dersID;
	}
	public void setDersID(int dersID) {
		this.dersID = dersID;
	}
	public String getDersAd() {
		return dersAd;
	}
	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	public int getDersKredi() {
		return dersKredi;
	}
	public void setDersKredi(int dersKredi) {
		this.dersKredi = dersKredi;
	}
	public void setogrAd(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setogrSoyad(String next) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
