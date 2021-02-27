package example.teashop;

public class Drinks {
    private String name;
    private int basePrice;
    private DrinksSpec spec;

    public Drinks(String name, int basePrice, DrinksSpec spec) {
        this.name = name;
        this.basePrice = basePrice;
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setPrice(int p) {
        this.basePrice = p;
    }

    public DrinksSpec getSpec() {
        return spec;
    }
}


