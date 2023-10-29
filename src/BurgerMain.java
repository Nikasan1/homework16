public class BurgerMain {
    public String meat;
    public String cheese;
    public String herb;
    public String bun;
    public String mayo;
    public String secondMeat;

    public BurgerMain(String meat, String cheese, String herb, String bun, String mayo) {
        this.meat = meat;
        this.cheese = cheese;
        this.herb = herb;
        this.bun = bun;
        this.mayo = mayo;
        System.out.println("Класичний бургер: " + meat + ", " + cheese + ", " + herb + ", " + bun + ", " + mayo+".");
    }

    public BurgerMain(String meat, String cheese, String herb, String bun) {
        this.meat = meat;
        this.cheese = cheese;
        this.herb = herb;
        this.bun = bun;
        System.out.println("Дієтичний бургер: " + meat + ", " + cheese + ", " + herb + ", " + bun+".");
    }

    public BurgerMain(String meat, String secondMeat, String cheese, String herb, String bun, String mayo) {
        this.meat = meat;
        this.secondMeat = secondMeat;
        this.cheese = cheese;
        this.herb = herb;
        this.bun = bun;
        this.mayo = mayo;
        System.out.println("Подвійний бургер: " + meat + ", " + secondMeat + ", " + cheese + ", " + herb + ", " + bun + ", " + mayo+".");

    }

}
