package Day03;

public class Q06_MultipleMethodVarargs {
    /*
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

    public static void main(String[] args) {

        ortalamaBul("Fatih",45,50.5);
        ortalamaBul("gulsum",75,80,85,90);
        ortalamaBul("sumeyra",45,50.5);
        ortalamaBul("nazli",45,50.5);


    }

    private static void ortalamaBul(String name,  double...notes) {
        double sum = 0;
        for (double eleman:notes) {
            sum+=eleman;
        }
        System.out.println(name + " in not ortalaması: " + sum/ notes.length);
    }

}
