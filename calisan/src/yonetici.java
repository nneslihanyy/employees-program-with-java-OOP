public class yonetici extends calisan
        
{
    private int sorumluKisi;
   public yonetici(String ad,String soyad,int id,int sorumluKisi){
       super(ad,soyad,id);
       this.sorumluKisi=sorumluKisi;
    }
    public void bilgileriGoster(){
       super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı :"+sorumluKisi);
    }
    public void ZamYap(int zamMiktari){
        System.out.println(getAd()+"çalışanlara"+zamMiktari+" kadar zam yapıyor");
    }
}
