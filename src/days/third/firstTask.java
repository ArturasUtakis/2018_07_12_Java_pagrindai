package days.third;

import days.Utilieties.NumberUtils;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        double ugis = NumberUtils.getCorrectNumber(scanner,"Iveskite savo ugi:");
        double svoris = NumberUtils.getCorrectNumber(scanner,"Iveskite savo svori:");

        double result = getKmi(ugis,svoris);

        System.out.println("Jusu KMI yra :"+ result);
    }
     private  static double getKmi(double ugis,double svoris){
        return svoris/Math.pow(ugis,2);
     }
}
