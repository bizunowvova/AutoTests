import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        sumTwo();
//        sumThree();
//        invert();
        oneLine();
    }
    public static boolean sumTwo() {
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
    public static void sumThree() {
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        int d = a + b + c;
        System.out.println("Сумма = " + d);
    }
    public static void invert() {
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        a *= -1;
        System.out.println("Invert: " + a);
    }
    public static void oneLine() {
        System.out.println("Введите первую строку");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String b = scanner.nextLine();
        System.out.println(a + " " + b);
    }
}
