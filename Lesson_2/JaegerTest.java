public class JaegerTest {
    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 250, 1.722f, 8, 6);
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(280);
        coyoteTango.setWeight(2.312f);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);

        System.out.println("Model Name is " + coyoteTango.getModelName());
        System.out.println(coyoteTango.getMark());
        System.out.println("Origin: " + coyoteTango.getOrigin());
        System.out.println("Height: " + coyoteTango.getHeight());
        System.out.println("Height: " + coyoteTango.getWeight());
        System.out.println("Weight: " + coyoteTango.getStrength());
        System.out.println("Armor: " + coyoteTango.getArmor());
        coyoteTango.move();
        coyoteTango.scanKaiju();
        coyoteTango.useWeapon();

        System.out.println("\nModel Name is " + crimsonTyphoon.getModelName());
        System.out.println(crimsonTyphoon.getMark());
        System.out.println("Origin: " + crimsonTyphoon.getOrigin());
        System.out.println("Height: " + crimsonTyphoon.getHeight());
        System.out.println("Height: " + crimsonTyphoon.getWeight());
        System.out.println("Weight: " + crimsonTyphoon.getStrength());
        System.out.println("Armor: " + crimsonTyphoon.getArmor());
        crimsonTyphoon.move();
        crimsonTyphoon.scanKaiju();
        crimsonTyphoon.useWeapon();
    }
}