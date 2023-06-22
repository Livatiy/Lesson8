public class Burger {


    String bun;
    String meat;
    String cheese;
    String green;
    String mayonnaise;


    public Burger(String bun, String meat, String cheese, String green, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер складається із: " + bun + ", " + meat + ", " + cheese + ", " + green + ", " + mayonnaise + ".");

    }

    public Burger(String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.println("Дієтичний бургер складається із: " + bun + ", " + meat + ", " + cheese + ", " + green + ".");

    }

    public Burger(String bun, String meat, String doubleMeat, String cheese, String green, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер з подвійним м'ясом складається із: " + bun + ", " + meat + ", " + doubleMeat + ", " + cheese + ", " + green + ", " + mayonnaise + ".");
    }

}