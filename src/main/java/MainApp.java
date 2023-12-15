import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String heroName;
    static int heroHP;
    static int heroAttack;
    static String monsterName = "Орк";
    static int monsterHP;
    static int monsterAttack;

    public static void main(String[] args) {
        init();
        System.out.println("Герой " + heroName + " бродил и увидел монстра " + monsterName + ". Придется драться.");

        while (true) {
            heroTurn();
            if (isGameOver()) {
                break;
            }
            printStatistic();
            monsterTurn();
            if (isGameOver()) {
                break;
            }
            printStatistic();
        }
    }
    public static boolean isGameOver() {
        if (monsterHP <= 0) {
            System.out.println("Герой победил!");
            return true;
        } else if (heroHP <= 0) {
            System.out.println("Монстр победил!");
            return true;
        }else return false;
    }
    public static void heroTurn() {
        System.out.println("Ход героя. Выберите действие. 1 - Атака, 2 - защита");
        int command = scanner.nextInt();
        if (command == 1) {
            monsterHP -= heroAttack;
        } else if (command == 2) {
            heroHP++;
        } else {
            System.out.println("Вы пропускаете ход...");
        }
    }
    public static void monsterTurn() {
        int monsterCommand = random.nextInt(2);
        if (monsterCommand == 0) {
            System.out.println("Теперь атакует монстр");
            heroHP -= monsterAttack;
            System.out.println("У героя осталось " + heroHP + " HP");
        } else {
            System.out.println("Монстр защищается");
            monsterHP++;
            System.out.println("У героя " + heroHP + "HP, у монстра " + monsterHP + "HP.");
        }
    }
    public static void printStatistic() {
        System.out.println();
        System.out.println("Статистика:");
        System.out.println("У героя " + heroHP + " HP.");
        System.out.println("у монстра " + monsterHP + " HP.");
        System.out.println();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        random = new Random();
        System.out.println("Введите имя вашего героя:");
        heroName = scanner.next();
        heroHP = 10;
        heroAttack = 3;
        monsterName = "Орк";
        monsterHP = 8;
        monsterAttack = 3;
    }
}

