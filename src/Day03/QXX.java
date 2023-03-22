package Day03;

public class QXX {
    public static void main(String[] args) {
        int [][] arr = new int[5][2];
        arr[1] = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
