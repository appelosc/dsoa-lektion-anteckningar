public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Car car = new Car("Porsche");
        Bike bike = new Bike("Scott");
        car.setPrice(10000);




        System.out.println(car.getName() + " is " + car.getVehicleType() );
        System.out.println(bike.getName() + " is " + bike.getVehicleType());


        System.out.println(car.getName()+ " kostar " + car.getPrice()*car.discount);

        System.out.println(bike.getName() + " säger " + bike.soundWarning());
        System.out.println(car.getName() + " säger " + car.soundWarning());


    }
    }

