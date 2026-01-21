import java.util.ArrayList;
import java.util.HashMap;

public class BikeShop {
    ArrayList<Bike> bikes = new ArrayList<>();


    public void addBike(Bike bike){
        bikes.add(bike);
    }

    public Bike getBike(int i){
        return bikes.get(i);
    }

    public int bikeCount (){
        return bikes.size();
    }
}
