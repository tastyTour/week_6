import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i][0] + arr[i][1] + arr[i][2];
            System.out.println("행 " + i + "의 합: " + sum);
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[0][i] + arr[1][i] + arr[2][i];
            System.out.println("열 " + i + "의 합: " + sum);
        }
    }
}
