package part2;

public class Crate<T> {

    private T content;

    public T lookInCrate() {
        return content;
    }

    public void packCrate(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant(3);
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.lookInCrate();
        System.out.println(inNewHome);

        // make some beer
        Beer beer = new Beer();
        // Make a robot
        Robot bender = new Robot();
        // send robot to New New York
        Crate<Robot> crateForRobot = new Crate<>();
        crateForRobot.packCrate(bender);
        // unpack
        Robot sadBender = crateForRobot.lookInCrate();
        sadBender.performAction(beer);
    }

    record Elephant(int age) {}
    record Beer() {
        @Override
        public String toString() {
            return "booze";
        }
    }
    record Robot() {
        public <V> void performAction(V target) {
            System.out.println("Drink all the " + target.toString() + " ");
        }
    }
}
