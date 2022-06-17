package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Khánh", 23, "Khu 1");
        Student student2 = new Student("Dương", 23, "Khu 2");
        Student student3 = new Student("Quây", 23, "Khu 3");

        Map map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student1);

        System.out.println(map);

        Set<Student> set = new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student1);

        System.out.println(set);
    }
}
