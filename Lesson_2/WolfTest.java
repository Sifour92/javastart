public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Male");
        wolf.setWeight(21);
        wolf.setName("Volk");
        wolf.setAge(5);
        wolf.setColor("White");
        System.out.println(wolf.getSex() + "\n" + wolf.getWeight() + "\n" + wolf.getName() + "\n"
                + wolf.getAge() + "\n" + wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
