import java.util.Scanner ;
public class gk {

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("1. sayiyi giriniz...");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int c ;
        c = sayi1 + sayi2 ;
        System.out.println("girdiğiniz sayiların toplama :" + c );
    }
}