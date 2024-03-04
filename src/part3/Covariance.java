package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Covariance {

    public static class Mammal {
        public List<CharSequence> play() {
            return List.of("playing");
        }

        public CharSequence sleep() {
            return "sleeping";
        }
    }

    public static class Monkey {
        public ArrayList<CharSequence> play() {
            ArrayList<CharSequence> list = new ArrayList<>();
            list.add("play catch");
            list.add("jump");

            return list;
        }
    }

    public static class Goat extends Mammal {
//        public List<String> play() { // fails due to type erasure even String is being a subtype of CharSequence
//            return List.of("");
//        }

        public String sleep() { //
            return "sleeping at a 92 degree angled bed";
        }
    }
}
