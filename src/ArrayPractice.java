public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
                System.out.println(max + " number[" + i + "] : " + numbers[i]);
            }
        }
        System.out.println("max = " + max);
    }
}
