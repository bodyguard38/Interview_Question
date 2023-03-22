package Day02;

import java.util.Scanner;

public class Q004_PerfectNumber {
      /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Bir sayi giriniz : ");
          int sayi = input.nextInt();

          for (int i = 1; i <sayi ; i++) {
              perfectSayi(i);
          }



      }

    private static void perfectSayi(int sayi) {
          int bolenleriToplami=0;
        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                bolenleriToplami+=i;
            }
        }
        if(bolenleriToplami==sayi){
            System.out.println(sayi+" Perfet sayidir..");
        }
    }
}
