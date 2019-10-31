import java.util.Scanner;

public class calisma {

    public static void main(String[] args) {
        
        System.out.println("*************************************");
        
        String islemler = "toplama icin 1'e basiniz\n" + 
                          "cikarma icin 2'e basiniz\n" +
                          "carpma ici 3'basiniz\n" +
                          "bölme icin 4'e basiniz\n" ;
        
        System.out.println(islemler);

        System.out.println("*************************************");
    
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen yapmak istediginiz islemi seciniz : ");
        int islem = scan.nextInt();

        System.out.println("islem yapmak icin degerleri giriniz...");

            int deger1;
            int deger2;
            int sonuc ;

            switch (islem) {

                case 1: {

                    System.out.print("birinci sayiyi giriniz : ");
                    deger1 = scan.nextInt();

                    System.out.print("ikinci sayiyi giriniz : ");
                    deger2 = scan.nextInt();

                    sonuc = deger1 + deger2 ;
                    System.out.println("isleminizin sonucu : " + sonuc + "' dir...");
                    break;
                }
                case 2: {

                    System.out.print("birinci sayiyi giriniz : ");
                    deger1 = scan.nextInt();

                    System.out.print("ikinci sayiyi giriniz : ");
                    deger2 = scan.nextInt();

                    sonuc = deger1 - deger2 ;
                    System.out.println("isleminizin sonucu : " + sonuc + "' dir...");
                    break;
                }
                case 3: {
                    System.out.print("birinci sayiyi giriniz : ");
                    deger1 = scan.nextInt();

                    System.out.print("ikinci sayiyi giriniz : ");
                    deger2 = scan.nextInt();

                    sonuc = deger1 * deger2 ;
                    System.out.println("isleminizin sonucu : " + sonuc + "' dir...");
                    break;
                }
                case 4: {
                    System.out.print("birinci sayiyi giriniz : ");
                    deger1 = scan.nextInt();

                    System.out.print("ikinci sayiyi giriniz : ");
                    deger2 = scan.nextInt();

                    sonuc = deger1 / deger2 ;
                    System.out.println("isleminizin sonucu : " + sonuc + "' dir...");
                    break;
                }
                default : {
                    System.out.println("lütfen gecerli bir islem giriniz ...");
                    break;
                }
            }

    }
}