public class Person implements Comparable<Person> {
    String name;


    public Person(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
