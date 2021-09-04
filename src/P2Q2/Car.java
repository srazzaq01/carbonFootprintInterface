package P2Q2;

public class Car implements CarbonFootprint{
    //data fields
    private double gallons;
    private String brand;
    private String model;

    //constructors
    public Car(){

    }

    public Car(double gallons, String brand, String model){
        this.gallons = gallons;
        this.brand = brand;
        this.model = model;
    }

    //accessors/mutators
    public void setGallons(double gallons){
        this.gallons = gallons;
    }

    public double getGallons(){
        return gallons;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    //overrides getCarbonFootprint
    @Override
    public double getCarbonFootprint(){
        return getGallons() * 20;
    }


}
