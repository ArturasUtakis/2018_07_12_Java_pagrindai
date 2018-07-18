package days.fifth;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savaites diena:");
        int numb = sc.nextInt();

Week week = Week.getDayById(numb);
        System.out.println(week.name());
    }
}
