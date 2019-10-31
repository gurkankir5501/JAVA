import java.util.Scanner ;
public class gk {

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("notunuzu giriniz = ");
        int notum = scan.nextInt();

        if (notum >= 60) {
            System.out.println("dersten gectiniz...");
        }
        else {
            System.out.println("dersten kaldiniz...");
        }
    }
}