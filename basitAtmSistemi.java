import java.util.Scanner;
public class calisma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("ziraat bankasina hosgeldiniz...");
        System.out.println("**************************************");

        int kasa = 0 ;
        int tutar;
        while (true){

            System.out.println("lütfen yapmak istediğiniz islemi seciniz :");
            String islemler = "1. islem : bakiye öğrenme\n" +
                              "2. islem : para cekme\n" +
                              "3. islem : para yatirma\n" +
                              "4.islem : kart iade" ;

            System.out.println(islemler);

            System.out.print("islem :");
            int islem = scan.nextInt();

            if (islem == 1){

                System.out.println("bakiyeniz : " + kasa + "TL 'dir '");

            }
            else if(islem == 2) {

                System.out.print("cekmek istediğiniz tutari giriniz : ");
                tutar = scan.nextInt();

                if (kasa >= tutar){

                    System.out.println(tutar + "TL cekim talebiniz onaylanmistir ");
                    kasa = kasa - tutar ;

                }
                else {

                    System.out.println("bakiyeniz yetersizdir");

                }
            }
            else if(islem == 3){

                System.out.println("yatırmak istediğiniz tutari giriniz :");
                tutar = scan.nextInt();

                kasa = tutar + kasa ;
            }
            else if (islem == 4){

                System.out.println("kartiniz iade ediliyor ");
                break;
            }
            else {
                
                System.out.println("yanlis islem yaptiniz , tekrar deneyiniz ");
            }



        }
    }
}