public class Question10 {
    public static void main(String[] args) {
        int[] score = {20,30,50,70,90};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("점수의 평균은 " + sum/score.length + " 입니다.");
    }
}
