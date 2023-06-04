import java.util.Arrays;

public class Two_lesson_method_five {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        int a = 0;
        for (int i = 0; i <= 99; i++) {
            a += 1;
            myArray[i] = a;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
