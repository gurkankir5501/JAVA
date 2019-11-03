import java.util.Scanner;
public class Login{

    

    public boolean login(Hesap hesap){

        Scanner scan = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("kullanici adinizi giriniz : ");
        kullaniciAdi = scan.nextLine();
        System.out.print("parolanizi giriniz : ");
        parola = scan.nextLine();

        if (kullaniciAdi.equals(hesap.getKullaniciAdi()) && parola.equals(hesap.getParola())){

            return true ;
        }
        else {

            return false;
        }
    }
}