import java.util.Scanner ;
public class gk {

    public static void main(String[] args){

        while(true){
            int bakiye = 1000 ;
            Scanner scan =new Scanner(System.in);
            System.out.println("bakiyenizi goruntulemek için 1'e basin lutfen...");
            System.out.println("para yatirmak icin 2'ye basin lutfen...");
            System.out.println("para cekmek icin 3'e basin lutfen...");
            System.out.println("cikis yapmak icin 4'e basin lutfen");


            System.out.println("yapmak istediginiz islemi secin lütfen  =  ");
            String islem =scan.nextLine();

            if (islem.equals("1")){
                System.out.println("bakiyeniz    "    + bakiye +     "  tl'dir..." );
                while (true){
                    int a = 1;
                    int b = 0;

                    System.out.println("Cıkıs yapmak icin 1'e Ana menüye dönmek icin 0'a basın  = ");
                    String x = scan.nextLine();
                    if (x.equals(a)){
                        System.out.println("sistemden basarili bir sekilde cıkıs yaptiniz ...");
                        System.exit(0);
                    }
                    else if (x.equals(b)){
                         System.out.println("ana menuye dondunuz...");
                         break;
                    }
                    else {

                        System.out.println("yanlis islem yaptiniz,tekrar deneyiniz...");
                    }

                }
            }
            else if (islem.equals("2")){
                System.out.println("yatırmak istediğiniz miktarı giriniz =  ");
                int yatirilan_para =scan.nextInt();
                bakiye = bakiye + yatirilan_para ;
                System.out.println("hesabınıza para yatırılmıştır...");
                System.out.println("yeni bakiyeniz     " + bakiye + "  tl'dir...");
                while(true){
                    int c = 1;
                    int d = 0;

                    System.out.println("Cıkıs yapmak icin 1'e Ana menüye dönmek icin 0'a basın  = ");
                    String y = scan.nextLine();

                    if (y.equals(c)){
                        System.out.println("sistemden basarili bir sekilde cıkıs yaptiniz ...");
                        System.exit(0);
                    }
                    else if (y.equals(d)){
                         System.out.println("ana menuye dondunuz...");
                         break;
                    }
                    else {
                         System.out.println("yanlis islem yaptiniz,tekrar deneyiniz...");
                    }
                }
            }
            else if (islem.equals("3")){
                System.out.println("çekmek istediğiniz miktarı giriniz = ");
                int cekilecek_para = scan.nextInt();
                bakiye = bakiye - cekilecek_para ;
                System.out.println("hesabinizdan paraniz basarili bir sekilde cekilmistir...");
                System.out.println("kalan bakiyeniz    "  + bakiye + "   tl'dir..." );

                while(true){
                    int e = 1;
                    int f = 0;
                    System.out.println("Cıkıs yapmak icin 1'e Ana menüye dönmek icin 0'a basın  = ");
                    String z = scan.nextLine();
                    if (z.equals(e)){
                        System.out.println("sistemden basarili bir sekilde cıkıs yaptiniz ...");
                        System.exit(0);
                    }
                    else if (z.equals(f)){
                         System.out.println("ana menuye dondunuz...");
                         break;
                    }
                    else {

                        System.out.println("yanlis islem yaptiniz,tekrar deneyiniz...");
                    }
                }
            }
            else if (islem.equals("4")){
                System.out.println("basarılı bi sekılde cıkıs yaptınız...");
                break ;
            }
            else {
                System.out.println("yanlis islem yaptiniz...");
            }



        }
        
    

    }
}