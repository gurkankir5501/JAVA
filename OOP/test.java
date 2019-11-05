import java.util.Scanner;

public class test {

    public static int inputAlma(){

       Scanner scan = new Scanner(System.in);
       int degisken = scan.nextInt();
       return degisken;
    }

    public static void main(String[] args) {

        

        Araba araba1 = new Araba();

        System.out.println("**********************************************");
        
        System.out.println(" BACANAKSOFT ' a hosgeldiniz ");

        System.out.println("**********************************************");

        

        System.out.print("kapi sayisini giriniz : ");
        ;
        araba1.setkapilar(inputAlma());
        

      

        System.out.println(araba1.getkapilar());

    }
}