package days.forth;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SecondTask {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(3);
        numbers.add(2);
        for (Integer number : numbers) {
            if (number >= 5 && number <= 10) {
                System.out.println(number);

            }
        }
    }
}
