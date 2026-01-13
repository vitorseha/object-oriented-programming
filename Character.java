public class Character {

    private String name;
    private int energy;
    private int hunger;
    private int sleep;

    // Base constructor (validates attributes)
    public Character(int energy, int hunger, int sleep) {
        this.energy = 10;
        this.hunger = 0;
        this.sleep = 0;

        if (energy >= 0 && energy <= 10) {
            this.energy = energy;
        }

        if (hunger >= 0 && hunger <= 10) {
            this.hunger = hunger;
        }

        if (sleep >= 0 && sleep <= 10) {
            this.sleep = sleep;
        }
    }

    // Full constructor (chained)
    public Character(String name, int energy, int hunger, int sleep) {
        this(energy, hunger, sleep);
        this.name = name;
    }

    void showStatus() {
        System.out.println(
            name
            + " | Energy: " + energy
            + " | Hunger: " + hunger
            + " | Sleep: " + sleep
        );
    }

    void hunt() {
        if (energy >= 2) {
            System.out.println(name + " is hunting");
            energy -= 2;
        } else {
            System.out.println(name + " has no energy to hunt");
        }

        hunger = Math.min(hunger + 1, 10);
        sleep = Math.min(sleep + 1, 10);

        showStatus();
    }

    void eat() {
        if (hunger >= 1) {
            System.out.println(name + " is eating.");
            energy = Math.min(energy + 1, 10);
            hunger--;
        } else {
            System.out.println(name + " is not hungry.");
        }

        showStatus();
    }

    void sleep() {
        if (sleep >= 1) {
            System.out.println(name + " is sleeping.");
            sleep--;
            energy = energy + 1 <= 10 ? energy + 1 : 10;
        } else {
            System.out.println(name + " is not sleepy.");
        }

        showStatus();
    }
}
