import java.util.Scanner;
public class kitap {
	private int id;
	private String baslik;
	private String yazar;
	private double fiyat;
	
	public kitap() {
		id = 1;
		baslik = "xxx";
		yazar = "yyy";
		fiyat = 111;
	}
	public kitap(int id1, String baslik1, String yazar1, double fiyat1) {
		id = id1;
		baslik = baslik1;
		yazar = yazar1;
		fiyat = fiyat1;
	}
	public void setKitap(int a, String b, String c,  double d) {
		id = a;
		baslik = b;
		yazar = c;
		fiyat = d;
	}
	public int getKitap_Id() {
		return this.id;	
	}
	public String getKitap_baslik() {
		return this.baslik;
	}
	public String getKitap_yazar() {
		return this.yazar;
	}
	public double getKitap_fiyat() {
		return this.fiyat;
	}
	public static void input() {

		Scanner scn = new Scanner(System.in);
		System.out.print("Id için bir tam sayý giriniz : ");
		int id = scn.nextInt();
		System.out.print("Baþlýk için bir string deðer giriniz : ");
		String baslik = scn.next();
		System.out.print("Yazar için bir string deðer giriniz : ");
		String yazar = scn.next();
		System.out.print("Fiyat için bir tam sayý giriniz : ");
		double fiyat = scn.nextDouble();
	}
	public void print() {
		System.out.println("Id:"+id+" Baþlýk: "+ baslik+" Yazar:"+yazar+ " Fiyat: "+fiyat);
	}
}
