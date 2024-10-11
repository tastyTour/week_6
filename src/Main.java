public class Main {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3};      // 기존 배열
        int[] newArray = new int[5];     // 새로운 배열 생성
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length); // 배열 복사;

        System.out.println(oldArray);
    }
}