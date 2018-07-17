package days.forth;

import java.util.*;

public class SecondExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names =  new ArrayList<>();
        for (int i = 0; i<5;i++){
            System.out.println("Iveskite" + i + "varda");
            String name = sc.nextLine();
            names.add(name);

        }
        Collections.sort(names);
        names.forEach(System.out::println);

    }
}
