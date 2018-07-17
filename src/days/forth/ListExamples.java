package days.forth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("Petras");
        names.add("Jonas");
        names.add("Paulius");
        names.add("Mindaugas");

        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j));
        }
        for (String name : names) {//nuo 7
            System.out.println(name);
        }
        names.forEach(System.out::println);// nuo 8
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Petras"));//
    }
}
