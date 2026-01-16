public class Car extends Vehicle {


    // Overload
    public Car(String name, double price){
        super(name, "motorized" );
        super.price = price;
        super.discount= 0.9;

    }
    public Car(String name){
        super(name, "motorized" );
        super.discount= 0.9;

    }

    @Override
    public String soundWarning() {
        return "Vrooom";
    }
}
