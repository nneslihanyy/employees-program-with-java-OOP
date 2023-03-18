import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoş Geldiniz");
        String islemler="İşlemler...\n"+"" +
                "1. Yazılımcı İşlemleri\n"+
                "2.Yönetici İşlemleri\n" +
                "Çıkış için q'ya basın..";
        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("*****************");
        while (true){
            System.out.println("İşlemi seçiniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkış yapılıyor.");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci=new yazilimci("Neslihan","Yağmurca",115922,"Java,C,C#");
                String yazilimciIslem="1. Format At\n"+
                                        "2.Bilgileri Göster \n"+
                                        "Çıkış için q ya basınız";
                System.out.println(yazilimciIslem);

                while(true){
                    System.out.println("İşlemi seçin");
                    String yazilimciislem=scanner.nextLine();
                    if(yazilimciislem.equals("q")){
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    }
                    else if(yazilimciislem.equals("1")){
                        System.out.println("İşletim sistemi:");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (yazilimciislem.equals("2"))
                    {
                     yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz giriş yapıldı....");
                    }
                }

            }
            else if(islem.equals("2")){
                yonetici yonetici=new yonetici("Berkay","BAL",225,20);
                String yoneticiislem="Yonetici islemleri..\n"+
                        "1. Zam Yap\n"+
                        "2. Bilgileri Göster..\n"+
                        "Çıkış için q'ya bas";
                System.out.println(yoneticiislem);
                while ((true)){
                    System.out.println("İşlemi seçiniz...");
                    String yoneticiIslem=scanner.nextLine();
                    if(yoneticiIslem.equals("q")){
                        System.out.println("İşlemler sonlandırılıyor...");
                        break;
                    }
                    else if (yoneticiIslem.equals("1"))
                    {
                        System.out.println("Ne kadar zam yapılmasını istiyorsunuz?");
                        int zam=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.ZamYap(zam);
                    }
                    else if (yoneticiIslem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici işlemi");
                    }
                }
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}