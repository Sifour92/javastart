public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.weight = 32.2;
        wolf.name = "Voloda";
        wolf.age = 2;
        wolf.color = "gray";
        System.out.println(wolf.sex + "\n" + wolf.weight + "\n" + wolf.name + "\n" + wolf.age + "\n" + wolf.color);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
