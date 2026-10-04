import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи своё имя: ");
        String name = scanner.nextLine();

        System.out.print("Введи свой возраст: ");
        int age = scanner.nextInt();

        System.out.println("Привtет, " + name + "! Тебе " + age + " лет.");

        scanner.close();
    }
}