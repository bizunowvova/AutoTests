import java.util.Arrays;

public class Two_lesson_method_six {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray.length; i++) {
            int num = myArray[i];
             if (num < 6) {
                 num *= 2;
                 myArray[i] = num;
             }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
