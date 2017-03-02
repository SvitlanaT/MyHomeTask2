package lesson6.classWork;

import java.util.*;

/**
 * @author Света on 28.02.2017.
 */
public class Memory {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();


        Map<String, String> map = new HashMap<>();

        map.put("email", "Igor");

        map.put("Email", "Ukraine");

        System.out.println(map.get("email"));

        for (String s : map.values()) {
            System.out.println(s);
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
            stringStringEntry.getValue();
        }
    }
}
