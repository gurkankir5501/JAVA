java.util.Scanner dosyasını içe aktarın ;
Kamu  class  calisma {

    genel  statik  int  ebobBul ( int  sayi1 , int  sayi2 ) {

        int j =  1 ;
        int i =  2 ;
        while (i <= sayi1) {

            if ((sayi1 % i ==  0 ) && (sayi2 % i ==  0 )) {
                
                sayi1 = sayi1 / i;
                sayi2 = sayi2 / i;
                j = j * i;
            }
            başka {

                i = i +  1 ;
            }
        }
        
        geri dönüş j;
    }

    genel  statik  boşluk  ana ( String [] args ) {

        Tarayıcı taraması =  yeni  Tarayıcı ( Sistem . );

        Sistem . dışarı . print ( " birinci sayiyi giriniz: " );
        int sayi1 = tarama . nextInt ();
        
        Sistem . dışarı . print ( " ikinci sayiyi giriniz: " );
        int sayi2 = tarama . nextInt ();

        int ebob = ebobBul (sayi1, sayi2);

        Sistem . dışarı . println ( " iki sayinin ebobu: "  + ebob);
    }
}

