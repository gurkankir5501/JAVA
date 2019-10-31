import java.util.Scanner;
public class calisma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int sayi1 = sayi;
        int sayi2 = sayi;

        int i = 0;
        while(true){

            sayi1 = sayi1 / 10 ;
            i = i + 1;

            if (sayi1 == 0){
                
                break;

            }
        }
        int a = 0;
        int sonuc = 0;
        int araci = 0;
        int j = 1 ;
        while(j <= i) {

            araci = sayi2 % 10;
            sayi2 = sayi2 / 10;
            
            int k = 1;
            int m = 1;
            while(k <= i){

                m = m * araci;
                k = k + 1;
            }

            sonuc = sonuc + m;
            a = sonuc ;
            j = j + 1;

        }

        if (sayi == a){

            System.out.println(sonuc + "sayimiz amstrong sayidir...");

        }
        else {
            System.out.println(sonuc + "sayimiz amstorng sayi degildir!!!");
        }
    }
}