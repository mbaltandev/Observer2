public class Uye implements IUye{
    private String Email;
    private String Ad;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public Uye(String email, String ad) {
        Email = email;
        Ad = ad;
    }


    @Override
    public void Update(absUrun urun) {
        System.out.println(urun.getUrunAdi()+" "+ urun.getFiyat()+"TL olarak guncellendi "+this.getEmail()+" maile mesaj gonderildi");

    }
}
