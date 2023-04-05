import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int n;
        int num, max, min;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        n = inp.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        num = inp.nextInt();
        max = num;
        min = num;

        for (int i = 1; i <= n-1 ; i++) {
            System.out.print(i + 1+". sayıyı giriniz: ");
            num = inp.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayi: " + min);
    }

}


