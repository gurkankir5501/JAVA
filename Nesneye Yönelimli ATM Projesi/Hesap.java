public class  Hesap {

    private int bakiye;
    private String kullaniciAdi;
    private String parola;

    public void hesap(int bakiye ,String kullaniciAdi, String parola){

        this.bakiye = bakiye;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }
    
    public void setBakiye(int bakiye){

        this.bakiye = bakiye;
    }

    public int getBakiye(){

        return bakiye;
    }

    public void setKullaniciAdi(String kullaniciAdi){

        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciAdi(){

        return kullaniciAdi;
    }

    public void setParola(String parola){

        this.parola = parola;
    }

    public String getParola(){

        return parola;
    }

    public void paraYatir(int tutar){

        bakiye = bakiye + tutar;

        System.out.println("yeni bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar){

        if (bakiye < tutar){

            System.out.println("bakiyeniz yetersizdir...");
        }
        else {

            bakiye = bakiye - tutar;
            System.out.println("yeni bakiyemiz : " + bakiye);
        }
    }
}