package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsExample1Good {

    public static void printNames(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
//        names.add(new HashMap());
        names.add("Leorio");
        printNames(names);
    }
}
