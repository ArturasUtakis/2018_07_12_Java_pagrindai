package days.forth;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public MapExample(){

    }
    public static void main(String[] args) {
        Map<Integer,String> names = new TreeMap<>();
        names.put(2,"Jonas");
        names.put(3,"Andrius");
        names.put(1,"Jonas");
        names.put(5,"Petras");
        names.put(5,"Jokubas");

        System.out.println(names.size());
        for(Integer key : ((TreeMap<Integer, String>) names).descendingKeySet()){
            System.out.println("key" + key + "" + names.get(key));
        }
        System.out.println(names.get(3));
    }
}
