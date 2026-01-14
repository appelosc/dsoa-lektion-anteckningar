public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Car car = new Car("Porsche");
        System.out.println(car.getName());
        car.setName("VW");
        System.out.println(car.getName());
    }
}
