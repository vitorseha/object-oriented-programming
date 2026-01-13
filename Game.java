public class Game {

    public static void main(String[] args) throws InterruptedException {

        Character hunter = new Character("John", 10, 0, 0);
        Character sleepy = new Character("Sleepy", 2, 6, 4);

        while (true) {
            hunter.hunt();
            sleepy.sleep();

            hunter.eat();
            sleepy.sleep();

            hunter.sleep();
            sleepy.sleep();

            hunter.hunt();
            sleepy.eat();

            hunter.hunt();
            sleepy.hunt();

            System.out.println("====================");
            Thread.sleep(3000);
        }
    }
}
