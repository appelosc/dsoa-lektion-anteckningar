public class Person {
    String name;
    Person next;

    public Person(String name) {
        this.name = name;
        this.next = null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }
}
