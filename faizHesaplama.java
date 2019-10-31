import java.util.Scanner;
public class calisma {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("yatirmak istediginiz tutari giriniz :");
        float tutar = scan.nextFloat();

        float gecici_tutar = tutar;
        float kazanilan_faiz;

        System.out.print("kac yil vadede yatirmak istediginizi giriniz :");
        int vade = scan.nextInt();

        float faiz = 0.06f ;

        int sayac = 1;
        while(true) {

            gecici_tutar = gecici_tutar + (gecici_tutar * faiz);
            
            
            if (vade == sayac) {

                kazanilan_faiz = gecici_tutar - tutar ;
                System.out.println(tutar + " TL ana paraniz " +
                                   vade + " yil vade sonrasinda " + 
                                   kazanilan_faiz + "TL faiz kazanarak " + 
                                   gecici_tutar + "TL olmustur...");
                break;
            }
            sayac = sayac + 1;
        }

    }
}