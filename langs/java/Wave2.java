import java.util.Scanner;

public class Wave2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        for (int i = 0; i < 3; i++) {
            if ((i + 1) % 2 == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
            } else {
                for (int j = 2; j >= 0; j--) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
        }

        sc.close();

    }
}
