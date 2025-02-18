public class Tea extends CaffeinatedBeverage {
    super();
    //Instance Variables
    private int brewTemp;

    public Tea() {
        super("", 0, 0.0);
        brewTemp = 0;

    }
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }
    public int getBrewTemp() {
        return this.brewTemp;
    
    }
    public void setBrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    } 

}
