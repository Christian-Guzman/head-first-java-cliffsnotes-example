public class Doggie {
    int size;
    String breed;
    String name;

    public Doggie(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    void bark() {
        System.out.println("Meow");
    }
}