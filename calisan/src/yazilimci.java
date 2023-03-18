public class yazilimci extends calisan
{
   private String diller;
    public yazilimci(String ad,String soyad,int id,String diller){
        super(ad,soyad,id);

        this.diller=diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println();
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller:"+diller);
    }
}

