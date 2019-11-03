import java.util.Scanner;
public class Atm{

    public void calis(Hesap hesap){

        Login login = new Login();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("ALBAYRAK bankasina hosgeldiniz ....");

        System.out.println("***********************************************");
        System.out.println("kullanici girisi : ");
        System.out.println("************************************************");
        
        int girishakki = 3;

        while (true){

            if (login.login(hesap)==true){

                System.out.println("Sisteme basarili bir sekilde giris yaptiniz ...");
                break;
            }
            else {

                System.out.println("kullanici adiniz veya parolaniz yanlis , tekrar deneyiniz ...");
                girishakki = girishakki - 1;
                System.out.println(girishakki + "hakkiniz kaldi ....");
            }
            if (girishakki == 0 ){

                System.out.println("uc kere hatali giris yaptiniz , sistemden cikiliyor...");
                break;
            }

        }


        System.out.println("yapmak istediginiz islemi secin lutfen :");

        String islemler = " 1 . bakiye görünteleme \n " + 
                          "2 . para cekme islemi \n " +
                          "3 . para yatirma islemi \n " +
                          "4 . kart iade ";

        System.out.println(islemler);
        
        while(true){

            System.out.print("islem secin lütfen :");
            int islem = scan.nextInt();
            
            if (islem == 1){

                System.out.println("hesabinizda "+hesap.getBakiye()+" TL bulunmaktadir...");
            }
            else if (islem == 2){

                System.out.print("cekmek isdeginiz tutari giriniz :");
                int tutar = scan.nextInt();

                System.out.println("para cekme islemimiz basliyor :");
                hesap.paraCek(tutar);

            }
            else if(islem == 3){

                System.out.print("yatirmak istediginiz tutari giriniz :");
                int tutar = scan.nextInt();

                System.out.println("para yatirma isleminiz devam ediyor :");
                hesap.paraYatir(tutar);
            }
            else if (islem == 4){

                System.out.println("programdan cıkılıyor ...");
                System.exit(0);
            }
            else {

                System.out.println("dogru islem yapiniz .... ");
            }
        }

    }
}