package example.teashop;

public class DrinksSpec {
    private Size size;
    private AddOn addOn;
    private BeverageTemperature beverageTemperature;
    private Sweetness sweetness;
 
    public DrinksSpec(Size size, AddOn addOn, BeverageTemperature beverageTemperature, Sweetness sweetness) {
        this.size = size;
        this.addOn = addOn;
        this.beverageTemperature = beverageTemperature;
        this.sweetness = sweetness;
    }

    public Size getSize() {
        return size;
    }

    public AddOn getAddOn() {
        return addOn;
    }

    public BeverageTemperature getBeverageTemperature() {
        return beverageTemperature;
    }

    public Sweetness getSweetness() {
        return sweetness;
    }

    public boolean matches(DrinksSpec otherSpec) {
        if (size != otherSpec.size)
          return false;

    
        if (addOn != otherSpec.addOn)
            return false;

        if (beverageTemperature != otherSpec.beverageTemperature)
            return false;
            
        if (sweetness != otherSpec.sweetness)
            return false;

        return true;
    }
}
