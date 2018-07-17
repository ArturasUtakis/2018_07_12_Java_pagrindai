package days.forth;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList <>();
        names.add ("Jonas");
        names.add ("Petras");
        names.add ("Julius");
        names.add ("Zigmas");
        names.add ("Povilas");

            for (String name : names){
                if (name.length()>6){
                    System.out.println(name);
                }
        }
FirstTask f = new FirstTask();
        System.out.println(f.getFirst(names));
        System.out.println(f.getLast(names));
    }
    private String getFirst(List<String >names){
        return names.get(0);
    }
    private String getLast(List<String >names){
        return names.get(names.size()-1);
    }
}
