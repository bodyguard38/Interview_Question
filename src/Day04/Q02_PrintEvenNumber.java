package Day04;

import java.util.Scanner;


public class Q02_PrintEvenNumber {
    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        System.out.println(isEven(sayi));
    }

    private static boolean isEven(int b) {

        if (b%2==0){
            return true;
        }else
            return false;
    }


}
