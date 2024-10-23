import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("확인할 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                result = true;
                break;
            }
        }
        if (result == true) {
            System.out.println(num + "은 배열에 존재합니다.");
        }else {
            System.out.println(num + "은 배열에 존재하지 않습니다.");
        }

    }
}
