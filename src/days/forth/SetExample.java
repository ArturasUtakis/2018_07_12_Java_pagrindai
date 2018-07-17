package days.forth;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Jonas");
        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Andrius");
        System.out.println(names.size());
        names.forEach(System.out::print);//Java 8, names - SET (ciklas kuris ima po viena reiksme)

    }
}
