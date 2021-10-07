
public class deneme_Kitap {

	public static void main(String[] args) {
		kitap k1 = new kitap();
		k1.print();
		
		kitap k2 = new kitap(1,"Kitap Başlık","Kitap Yazar",150);
		k2.print();
		
		System.out.println("Kitap id:" + kitap.getKitap_Id() + "Kitap Başlığı :  "+kitap.getKitap_baslik+"Kitap Yazarı : "+kitap.getKitap_yazar()+ "Kitap Fiyatı: "+ kitap.getKitap_fiyat());
        kitap.setKitap(50);
        System.out.println("Kitap adÄ±:" + kitap.getBaslik() + "\tKitap FiyatÄ±: " + kitap.getFiyat());
		
	}

}
