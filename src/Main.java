public class Main {
    public static void main(String[] args) {
        BikeShop bikeshop = new BikeShop();

        System.out.println("Välkommen till vår bikeshop");

        bikeshop.addBike(new Bike("Scott",500));
        bikeshop.getBike(0).addSpec("wheel-size", "29-inch");
        bikeshop.getBike(0).addSpec("suspension", "Air");

        bikeshop.addBike(new Bike("Jopo",700));
        bikeshop.addBike(new Bike("BMX",400));
        bikeshop.addBike(new Bike("Mountainbike",1200));



        for (int i = 0; i < bikeshop.bikeCount(); i++) {
            Bike bike = bikeshop.getBike(i);
            System.out.printf("%s %.2f saldo: %d\n%s\n",bike.getName(),bike.getPrice(),bike.getStock(), bike.getSpecsString());
        }

        System.exit(0);

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

