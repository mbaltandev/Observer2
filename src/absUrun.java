import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class absUrun {
    private int fiyat;
    public String urunAdi;

    private ArrayList<IUye> takipList=new ArrayList<>();

    public void takipEkle(IUye uye){
        takipList.add(uye);
    }
    public void takipCikar(IUye uye){
        takipList.remove(uye);
    }

    public absUrun(String urunAdi,int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if (fiyat>this.fiyat){
            this.fiyat = fiyat;
            NotifyUrun();
        }
        else{
            this.fiyat = fiyat;
        }



    }

    public  void NotifyUrun(){

        for(IUye takipci:takipList){
            takipci.Update(this);
        }
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
}
