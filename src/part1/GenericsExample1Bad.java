package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsExample1Bad {

    public static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // Possible ClassCastException
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new HashMap());
        printNames(names);
    }
}
