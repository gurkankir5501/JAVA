import java.util.Scanner;
public class calisma {

    public static int asalmi(int foo){

        int i = 2;
        while (i < foo ) {

            if (foo % i == 0 ) {

                return 1;
            }

            i = i + 1;
        }
        return 2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("bir sayi giriniz : ");
        int sayi = scan.nextInt();


        if (asalmi(sayi) == 2) {

            System.out.println(sayi + " sayisi asal sayidir ...");
        }
        else {

            System.out.println(sayi + " sayisi asal sayi degildir ...");
        }
    }
}