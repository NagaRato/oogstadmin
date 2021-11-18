package model;

public class Certificate {
    private int id;
    private String name;
    private int mouths;

    public Certificate(int id, String name, int mouths) {
        this.id = id;
        this.name = name;
        this.mouths = mouths;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMouths() {
        return mouths;
    }
}
