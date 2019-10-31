import java.util.Scanner;
public class gk {


    public static void faktoriyel(){

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int sayi = scan.nextInt();
        int faktoriyell = 1;
        while(sayi>0){

            faktoriyell = faktoriyell * sayi ;
            sayi--;
            
        }
        System.out.println("faktoriyel  = " + faktoriyell );

    }
    public static void main(String[] args){

        faktoriyel();

            

    }
}