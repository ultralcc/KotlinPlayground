package KotlinInAction.ch02;

/* Java */
public class Person {
    private String name;
    private Boolean isMarried;

    public Person(String name,Boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }
    Boolean isMarried() {
        return isMarried;
    }
}
