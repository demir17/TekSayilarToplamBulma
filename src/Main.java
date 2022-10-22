import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, toplam = 0;

        do {
            System.out.println("Bir sayı giriniz: ");
            n = sc.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                toplam += n;
            }
        }while (n % 2 ==0);

        System.out.println("Girilen sayılardan çift ve dördün katı olan sayıların toplamı: " + toplam);


    }
}
