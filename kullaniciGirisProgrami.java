import java.util.Scanner;
public class calisma {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String sys_kullanici ="gk" ;
        String sys_parola ="gkek123";
        int deneme_hakki = 3;
        int sayac = 0 ;

        while (sayac < deneme_hakki) {

            System.out.print("lütfen kullanici adinizi giriniz : ");
            String kullanici = scan.nextLine();

            System.out.print("lütfen parolanizi giriniz : ");
            String parola = scan.nextLine();

            if (kullanici.equals(sys_kullanici) &&  parola.equals(sys_parola)){

                System.out.println("sisteme basarili giris yaptiniz ...");
                break;
            }
            else if (!kullanici.equals(sys_kullanici) &&  parola.equals(sys_parola)){
                
                System.out.println("kullanici adiniz yanlis ");
            }
            else if  (kullanici.equals(sys_kullanici) &&  !parola.equals(sys_parola)){

                System.out.println("parolaniz yanlis");
            }
            else {

                System.out.println("kullanici adiniz veya parolaniz yanlis ");
            }

            sayac = sayac + 1;

            if (sayac == deneme_hakki) {

                System.out.println("3 kere hatali giris yaptiginiz icin sistemden cikiliyor !!! ");
            }
            else {

                int kalan_hak = deneme_hakki - sayac;
                System.out.println("kalan hakkiniz : " + kalan_hak );
            }
        }
    }
}