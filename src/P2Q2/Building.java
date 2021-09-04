package P2Q2;

public class Building implements CarbonFootprint{
    //data fields
    private double sqFT;
    private double height;

    //constructors
    public Building(){

    }

    public Building(double sqFt, double height){
        this.sqFT = sqFt;
        this.height = height;
    }

    //accessors/mutators
    public void setSqFT(double sqFT){
        this.sqFT = sqFT;
    }

    public double getSqFT(){
        return sqFT;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    //overrides getCarbonFootprint
    @Override
    public double getCarbonFootprint(){
        return ((50*sqFT) + (20*sqFT) + (47*sqFT) + (17*sqFT));
    }

}
