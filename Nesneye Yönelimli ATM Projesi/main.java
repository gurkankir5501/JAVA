public class main{

    public static void main(String[] args){

        Atm atm = new Atm();
        Hesap hesap = new Hesap();
        hesap.hesap(1000,"emine albayrak","15052019");

        atm.calis(hesap);

        
    }
}
