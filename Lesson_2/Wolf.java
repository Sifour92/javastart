public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Wolf is walking");
    }

    public void sit() {
        System.out.println("Wolf is sitting");
    }

    public void run() {
        System.out.println("Wolf is running");
    }

    public void howl() {
        System.out.println("Wolf is howling");
    }

    public void hunt() {
        System.out.println("Wolf is hunting");
    }
}
