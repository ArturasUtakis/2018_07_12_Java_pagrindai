package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pasirinkite figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");

        String selection = scanner.nextLine();
        thirdTask thirdTask = new thirdTask();
        System.out.println(thirdTask.trikampioPlotas(scanner));
        System.out.println(thirdTask.staciakampioPlotas(scanner));
        System.out.println(thirdTask.kvadratoPlotas(scanner));
        System.out.println(thirdTask.apskritimoPlotas(scanner));

        switch (selection) {
            case "a":
                thirdTask.trikampioPlotas(scanner);
                break;
            case "b":
                thirdTask.staciakampioPlotas(scanner);
                break;
            case "c":
                thirdTask.kvadratoPlotas(scanner);
                break;
            case "d":
                thirdTask.apskritimoPlotas(scanner);
                break;
            default:
                System.out.println("Blogas pasirinkimas");
                break;
        }

    }

    private double trikampioPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner,"Iveskite a statini");
        double b = getCorrectNumber(scanner,"Iveskite b statini");
        return (a * b) / 2;
    }

    private double staciakampioPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner,"Iveskite a krastine");
        double b = getCorrectNumber(scanner,"Iveskite b krastine");
        return (a * b);
    }

    private double kvadratoPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner,"Iveskite krastine");
        return (a * a);
    }

    private double apskritimoPlotas(Scanner scanner) {
        System.out.println("Iveskite izambine:");
        double a = getCorrectNumber(scanner,"Iveskite spinduli");
        return Math.PI * Math.pow(a, 2);
    }

    private double getCorrectNumber(Scanner sc, String message) {
        double result;
        while (true) {
            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nepavyko pakartokite");
                sc.nextLine();
            }
        }
        return result;
    }
}

