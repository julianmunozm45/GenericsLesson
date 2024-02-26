package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverLoading {

    public static class LongTailAnimal {
        protected void chew(List<Object> input) {}
        // protected void chew(List<Double> input) {} Does not compile due to erasure reducing both to chew(List input)
    }

    public static class Anteater extends LongTailAnimal {
//        protected void chew(List<Double> input) {} Does not compile due to erasure since parent class will have chew(List input)
        protected void chew(List<Object> input) {} // overrides parent method correctly chew(List input)
        protected void chew(ArrayList<Object> input) {} // will be chew(ArrayList input)
        protected void chew(String input) {} // will be chew(String input)
    }
}
