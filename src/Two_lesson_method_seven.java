import java.util.Arrays;

public class Two_lesson_method_seven {
    public static void magic(int len, int initialValue) {
        int[] myArray = new int[len];
        Arrays.fill(myArray, initialValue);
        System.out.println(Arrays.toString(myArray));
    }
    public static void main(String[] args) {
        magic(4, 7);
    }
}

