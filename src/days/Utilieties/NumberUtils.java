package days.Utilieties;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberUtils {
    public static double getCorrectNumber(Scanner sc,String message){
        double result;
        while(true){
            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Nepavyko pakartokit");
                sc.nextLine();
            }
        }
        return result;
    }
}
