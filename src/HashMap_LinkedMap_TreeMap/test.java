package HashMap_LinkedMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1,"Cao");
        map.put(2,"Quốc");
        map.put(3,"Khánh");
        map.put(3,"Phanh");
        System.out.println(map);

        Map map1 = new LinkedHashMap();
        map1.put(1, "Cao");
        map1.put(2, "Quốc");
        map1.put(3, "Khánh");
        System.out.println(map1);

        Map map2 = new TreeMap<>();
        map2.put("Cao", 1);
        map2.put("Quốc", 2);
        map2.put("Khánh", 3);
        System.out.println(map2);

    }
}
