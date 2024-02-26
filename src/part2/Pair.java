package part2;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F _1() {
        return first;
    }

    public S _2() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> ageAndName = new Pair<>(28, "Hamelin");
        System.out.printf(
                "First: %d, Second: %s%n",
                ageAndName._1(),
                ageAndName._2()
                );
    }
}
