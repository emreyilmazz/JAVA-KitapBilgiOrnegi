
public class deneme_Kitap {

	public static void main(String[] args) {
		kitap k1 = new kitap();
		k1.print();
		
		kitap k2 = new kitap(1,"Kitap Ba�l�k","Kitap Yazar",150);
		k2.print();
		
		System.out.println("Kitap id:" + kitap.getKitap_Id() + "Kitap Ba�l��� :  "+kitap.getKitap_baslik+"Kitap Yazar� : "+kitap.getKitap_yazar()+ "Kitap Fiyat�: "+ kitap.getKitap_fiyat());
        kitap.setKitap(50);
        System.out.println("Kitap adı:" + kitap.getBaslik() + "\tKitap Fiyatı: " + kitap.getFiyat());
		
	}

}
