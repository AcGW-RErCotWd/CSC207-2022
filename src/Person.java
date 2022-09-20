public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Void setName(String newName) {
        this.name = newName;
        return null;
    }

}
