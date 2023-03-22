package Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q003_FibonacciListNumber {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {
         List<Integer> fibonacciList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         System.out.print("bir sayi giriniz  :");

         int sayi = scanner.nextInt();
         fibonacciList.add(0);
         fibonacciList.add(1);

         int eleman=1;
         int i=2;
         while (eleman<sayi){
             fibonacciList.add(eleman);
             i++;
             eleman=fibonacciList.get(i-1)+fibonacciList.get(i-2);

         }
         System.out.println(fibonacciList);
     }
}
