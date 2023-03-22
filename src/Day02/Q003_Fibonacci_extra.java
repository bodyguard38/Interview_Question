package Day02;

import java.util.Scanner;

public class Q003_Fibonacci_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = scanner.nextInt();

        // İlk iki sayı belirlenir ve ekrana yazdırılır
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        // Fibonacci dizisi oluşturulur ve ekrana yazdırılır
        int c;

        for (int i = 2; i < n; i++) {
            c = a + b;
            if (c<=n){
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
