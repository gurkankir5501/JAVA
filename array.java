import java.util.Scanner;
public class aa{

    public static void main(String[] args){
        int[] arr =new int[5];
        Scanner scan = new Scanner (System.in);
        System.out.println("degerleri giriniz...");
        
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("verileriniz yazdırılıyor...");
        for(int i = 0; i < arr.length;i++){

            System.out.println(i +". dizi elemanı" + arr[i]);
        }
    }
}