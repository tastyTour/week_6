public class Question9 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int[] copy = new int[number.length];
        System.arraycopy(number, 0, copy, 0, number.length);
        for (int i = 0; i < number.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
