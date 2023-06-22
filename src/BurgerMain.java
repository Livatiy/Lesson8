public class BurgerMain {
    public static void main(String[] args) {

        Burger normalBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("булочка", "м'ясо", "додаткове м'ясо", "сир", "зелень", "майонез");
    }
}
