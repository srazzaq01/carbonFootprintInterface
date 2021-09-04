package P2Q2;

public class Bicycle implements CarbonFootprint{
    //data fields
    private String type;
    private String handle;

    //constructors
    public Bicycle(){

    }

    public Bicycle(String type, String handle){
        this.type = type;
        this.handle = handle;
    }

    //accessors/mutators
    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setHandle(String handle){
        this.handle = handle;
    }

    public String getHandle(){
        return handle;
    }

    //overrides getCarbonFootprint
    @Override
    public double getCarbonFootprint(){
        return 0;
    }


}
