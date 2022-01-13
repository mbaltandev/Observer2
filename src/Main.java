public class Main {

    public static void main(String[] args) {
	Urun telefon=new Urun("Iphone",9888);
	Urun Bardak=new Urun("Kupa",65);
	Urun Bilgisayar=new Urun("Asus",8887);

    IUye batu=new Uye("batu@99.com","Batuhan");
    IUye mami=new Uye("mami@99.com","mami");
    IUye baris=new Uye("baris@99.com","baris");

    Bilgisayar.takipEkle(mami);
    Bilgisayar.takipEkle(baris);
    Bilgisayar.takipEkle(batu);
    Bardak.takipEkle(mami);
//    Bilgisayar.NotifyUrun();
    Bilgisayar.setFiyat(21312);

    Bilgisayar.takipCikar(batu);
    Bilgisayar.setFiyat(24124312);






    }
}
