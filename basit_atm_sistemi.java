import java.util.Scanner ;
public class gk {

    public static void main(String[] args){

        int bakiye = 1000 ;
        Scanner scan =new Scanner(System.in);
        System.out.println("bakiyenizi goruntulemek için 1'e basin lutfen...");
        System.out.println("para yatirmak icin 2'ye basin lutfen...");
        System.out.println("para cekmek icin 3'e basin lutfen...");
        System.out.println("cikis yapmak icin 4'e basin lutfen");


        System.out.println("yapmak istediginiz islemi secin lütfen");
        int islem =scan.nextInt();

        switch (islem){

            case 1:
            System.out.println("bakiyeniz"    + bakiye +     "tl'dir..." );
            break ;
            case 2:
            System.out.println("yatırmak istediğiniz miktarı giriniz ...");
            int yatirilan_para =scan.nextInt();
            bakiye = bakiye + yatirilan_para ;
            System.out.println("hesabınıza para yatırılmıştır...");
            System.out.println("yeni bakiyeniz" + bakiye + "tl'dir...");
            break;
            case 3:
            System.out.println("çekmek istediğiniz miktarı giriniz ...");
            int cekilecek_para =scan.nextInt();
            bakiye = bakiye - cekilecek_para ;
            System.out.println("hesabinizdan paraniz basarili bir sekilde cekilmistir...");
            System.out.println("kalan bakiyeniz"  + bakiye + "tl'dir..." );
            break;
            case 4: 
            System.out.println("basarılı bi sekılde cıkıs yaptınız...");
            break;
            default:
            System.out.println("yanlis islem yaptiniz...");
            break; 



        }
        


    }
}