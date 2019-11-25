public class Main{

    public static void main(String args[]){

        Resulation resulation = new Resulation(1920,1080);
        Anakart anakart = new Anakart("B250-PRO","ASUS",10,"WİNDOWS 10");
        Kasa kasa = new Kasa("Shado blade","shadow","temperli cam");
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resulation);
        Bilgisayar pc = new Bilgisayar(anakart,kasa,monitor);

        pc.getKasa().bilgisayari_ac();
        pc.bilgisayari_calistir();
        pc.getAnakart().isletim_sistemini_yukle();
        pc.getMonitor().monitoru_kapat();
    }
}
