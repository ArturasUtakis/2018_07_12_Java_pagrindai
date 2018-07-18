package days.fifth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ThirdTask {
    private static final String FILE_NAME = "src/names.txt";

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = bf.readLine()) != null) {
                names.add(line);
                //names.new(new Person(items [0], items[1], Integer.valueOf(items[2], items[3]);
                //System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Nenuskaitem " + e);
        }
        for (String name : names) {
            if (name.length() <= 6) {
                System.out.println(names);
            }

        }
    }
}
