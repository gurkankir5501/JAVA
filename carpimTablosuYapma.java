public class calisma {

    public static void main(String[] args) {

        for(int i= 1;i <= 10 ;i = i+1){

            int sonuc;
            for(int j=1;j<=10;j=j+1) {

                sonuc = i * j;
                System.out.println(i + " * " + j + " = " + sonuc);
            }
            System.out.println("*****************");
        }
    }
}