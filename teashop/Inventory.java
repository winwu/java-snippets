package example.teashop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Drinks> drinkList;
    
    public Inventory() {
        drinkList = new LinkedList<>();
    }

    public void addDrinks(String productId, int basePrice, DrinksSpec spec) {
        Drinks drinks = new Drinks(productId, basePrice, spec);
        drinkList.add(drinks);
    }

    // getDrinks

    public List<Drinks> search(DrinksSpec search) {
        List<Drinks> result = new LinkedList<Drinks>();

        for (Iterator<Drinks> i = drinkList.iterator(); i.hasNext();) {
            Drinks d = (Drinks)i.next();
            if (d.getSpec().matches(search)) {
                result.add(d);
            }
        }

        return result;
    }
}
