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

        araba1.setrenk("kırmızı");
        araba1.setkapilar(4);
        araba1.setmotor(5);
        araba1.setmodel("A5 serisi");
        araba1.settekerler(4);

        
           

        System.out.println("kapi sayisi : " + araba1.getkapilar() + "\n"+
                           "renk : " + araba1.getrenk() + "\n"+
                           "motor : " + araba1.getmotor() + "\n"+
                           "model : "+araba1.getmodel() + "\n"+
                           "tekerlek : "+ araba1.gettekerler());
    }
}