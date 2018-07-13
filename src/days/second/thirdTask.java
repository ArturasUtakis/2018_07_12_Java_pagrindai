package days.second;

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
    private double trikampioPlotas(Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a*b)/2;
    }
    private double staciakampioPlotas(Scanner scanner){
        System.out.println("Iveskite pirma krastine:");
        double a = scanner.nextDouble();
        System.out.println("Iveskite antra krastine:");
        double b = scanner.nextDouble();
        return (a*b);
    }
    private double kvadratoPlotas(Scanner scanner){
        System.out.println("Iveskite krastine:");
        double a = scanner.nextDouble();
        return (a*a);
    }
    private double apskritimoPlotas(Scanner scanner){
        System.out.println("Iveskite izambine:");
        double a = scanner.nextDouble();
        return Math.PI*Math.pow(a,2);
    }
}
