public class HomeWork1 {
    public static void printThreeWords() {
        orange();
        apple();
        banana();
    }
    static void orange(){
        System.out.println("Orange");
    }
    static void apple(){
        System.out.println("Apple");
    }
    static void banana(){
        System.out.println("Banana");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }
}

