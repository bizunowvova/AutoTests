import java.util.Arrays;

public class Two_lesson_method_four {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } else if (myArray[i] == 0) {
                myArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
