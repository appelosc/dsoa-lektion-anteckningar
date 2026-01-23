import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
        Scanner input = new Scanner(System.in);
        System.out.println("Srkiv någonting");
        String str = input.nextLine();
        System.out.printf("DU skrev %s\n",str);
         **/






        BikeShop bikeshop = new BikeShop();

        System.out.println("Välkommen till vår bikeshop");

        bikeshop.addBike(new Bike("Scott",500));
        bikeshop.getBike(0).addSpec("wheel-size", "29-inch");
        bikeshop.getBike(0).addSpec("suspension", "Air");

        bikeshop.addBike(new Bike("Jopo",700));
        bikeshop.getBike(1).addSpec("wheel-size", "24-inch");
        bikeshop.getBike(1).addSpec("suspension", "Spring");

        bikeshop.addBike(new Bike("BMX",400));
        bikeshop.getBike(2).addSpec("wheel-size", "22-inch");
        bikeshop.getBike(2).addSpec("suspension", "none");

        bikeshop.addBike(new Bike("Mountainbike",1200));
        bikeshop.getBike(3).addSpec("wheel-size", "20-inch");
        bikeshop.getBike(3).addSpec("suspension", "pneumatic");



        for (int i = 0; i < bikeshop.bikeCount(); i++) {
            Bike bike = bikeshop.getBike(i);
            System.out.printf("%d - %s %.2f saldo: %d\n%s\n",
                    i+1,bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString());
        }
        Scanner textInput = new Scanner(System.in);
        while (true){
            System.out.printf("Vilken cykel vill du köpa? (1-%d): ", bikeshop.bikeCount());
            String bikeInput = textInput.nextLine();
            try{
                int choosenBike = Integer.parseInt(bikeInput) - 1;
                Bike bikeowned = bikeshop.getBike(choosenBike);
                System.out.printf("Du äger nu en %s", bikeowned.getName());
                break;
            } catch (NumberFormatException e){
                System.out.println("Du måste ange ett heltal!");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Du måste ange ett tal mellan 1-4");
            } catch (Exception e){
                System.out.println("Någoting gick fel. " + e.getMessage());
            }
        }







        /**
        Car car = new Car("Porsche");
        Bike bike = new Bike("Scott");
        car.setPrice(10000);




        System.out.println(car.getName() + " is " + car.getVehicleType() );
        System.out.println(bike.getName() + " is " + bike.getVehicleType());


        System.out.println(car.getName()+ " kostar " + car.getPrice()*car.discount);

        System.out.println(bike.getName() + " säger " + bike.soundWarning());
        System.out.println(car.getName() + " säger " + car.soundWarning());
         **/


    }
    }

