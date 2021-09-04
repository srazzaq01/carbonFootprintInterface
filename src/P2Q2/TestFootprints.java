package P2Q2;


import java.util.ArrayList;

public class TestFootprints {
    public static void main(String[] args) {
        //creating an arraylist
        ArrayList<CarbonFootprint> cList = new ArrayList<>();

        //creating bicycle objects
        Bicycle b1 = new Bicycle("road", "normal");
        Bicycle b2 = new Bicycle("mountain", "double");

        //adding bicycles to the arraylist
        cList.add(b1);
        cList.add(b2);

        //creating car objects
        Car c1 = new Car(10, "ford", "bronco");
        Car c2 = new Car(20, "nissan", "altima");

        //adding cars to the arraylist
        cList.add(c1);
        cList.add(c2);

        //creating building objects
        Building bu1 = new Building(2500, 1000);
        Building bu2 = new Building(1500, 1250);

        //adding buildings to the arraylist
        cList.add(bu1);
        cList.add(bu2);

        //for loop to iterate through the arraylist
        for (int i = 0; i < cList.size(); i++){

            //if instanceof bike, call the proper methods for bike polymorphically
            if (cList.get(i) instanceof Bicycle){
                System.out.println("Bicycle of type " + ((Bicycle) cList.get(i)).getType() + ": " +
                        cList.get(i).getCarbonFootprint());
            }

            //if instanceof car, call proper methods for car polymorphically
            if (cList.get(i) instanceof Car){
                System.out.println("Car that has used " + ((Car) cList.get(i)).getGallons() + " gallons of gas: " +
                        cList.get(i).getCarbonFootprint());
            }

            //if instance of building, call proper methods for building polymorphically
            if (cList.get(i) instanceof Building){
                System.out.println("Building with " + ((Building) cList.get(i)).getSqFT() + " square feet: " +
                        cList.get(i).getCarbonFootprint());
            }
        }
    }
}




