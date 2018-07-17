package days.third;

import days.Utilieties.NumberUtils;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        double km = NumberUtils.getCorrectNumber(sc, "Iveskite nuvaziuota km skaiciu ");
        double lit = NumberUtils.getCorrectNumber(sc, "Iveskite kuro sanaudas:");
        double result = vidurkis(lit, km);
        System.out.println(result);
    }

    public static double vidurkis(double km, double lit) {
        return lit * 100 / km;
    }
}
