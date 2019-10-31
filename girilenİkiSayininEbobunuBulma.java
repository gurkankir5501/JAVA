import java.util.Scanner;
public class calisma {

    public static int ebobBul(int sayi1 ,int sayi2) {

        int j = 1;
        int i = 2;
        while (i <= sayi1) {

            if ((sayi1 % i == 0) && (sayi2 % i == 0)){
                
                sayi1 = sayi1 / i;
                sayi2 = sayi2 / i;
                j = j * i;
            }
            else {

                i = i + 1;
            }
        }
        
        return j;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        
        System.out.print("ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int ebob = ebobBul(sayi1,sayi2);

        System.out.println("iki sayinin ebobu : " + ebob);
    }
}