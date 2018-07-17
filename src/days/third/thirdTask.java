package days.third;

import days.Utilieties.NumberUtils;

import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        System.out.println("SKAICIUOTUVAS");
        Scanner sc = new Scanner((System.in));
        double firstNumb = NumberUtils.getCorrectNumber(sc, "Iveskite pirma skaiciu :");
        double secondNumb = NumberUtils.getCorrectNumber(sc, "Iveskite antra skaiciu :");

    }
}
