package ro.scoalainformala.inventory;

public class Child {
    private String name;
    private int age;
    private String toy;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return name + " of age " + age + " has selected:  " + toy;
    }

}
