import java.util.Scanner;
public class Depo{

    public static void main(String[] args){
    
    Hesap1 hesap1 = new Hesap1();
    Hesap2 hesap2 = new Hesap2();
    Kutu kutu = new Kutu();

    Scanner scan = new Scanner(System.in);

    System.out.println( "en giriniz :" );
    kutu.en = scan.nextDouble();

    System.out.println( "boy giriniz :" );
    kutu.boy = scan.nextDouble();

    System.out.println( "yukseklik giriniz :" );
    kutu.yukseklik = scan.nextDouble();

    System.out.println( hesap1.hacim1(kutu.en, kutu.boy, kutu.yukseklik));
    System.out.println(hesap2.hacim2(kutu) );
    

    }
}
