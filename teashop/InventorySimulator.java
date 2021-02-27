package example.teashop;

import java.util.Iterator;
import java.util.List;

public class InventorySimulator {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        addInventry(inventory);

        DrinksSpec whatCustomerWant = new DrinksSpec(Size.LARGE, AddOn.NO, BeverageTemperature.EASY_ICE, Sweetness.SUGAR_FREE);
        
        List<Drinks> matchDrinks = inventory.search(whatCustomerWant);

        if (!matchDrinks.isEmpty()) {
            System.out.println("今天有賣你需要的品項:");
            for (Iterator<Drinks> i = matchDrinks.iterator(); i.hasNext();) {
                System.out.println("------------------");
                Drinks d = (Drinks)i.next();
                DrinksSpec dSpec = d.getSpec();
                System.out.println("名稱:" + d.getName());
                System.out.println("單價:" + d.getBasePrice());
                System.out.println("容量:" + dSpec.getSize());
                System.out.println("加料項目:" + dSpec.getAddOn());
                System.out.println("熱度:" + dSpec.getBeverageTemperature());
                System.out.println("------------------");
            }
        } else {
            System.out.println("抱歉，今天沒有賣你要的品項");
        }
    }

    private static void addInventry(Inventory inventory) {
        // 微冰無糖紅茶  中杯
        inventory.addDrinks("紅茶", 30, new DrinksSpec(Size.MEDIUM, AddOn.NO, BeverageTemperature.EASY_ICE, Sweetness.SUGAR_FREE));
        
        // 微冰無糖紅茶  大杯
        inventory.addDrinks("紅茶", 50, new DrinksSpec(Size.LARGE, AddOn.NO, BeverageTemperature.EASY_ICE, Sweetness.SUGAR_FREE));
        
        // 熱 無糖珍珠紅茶 大杯
        inventory.addDrinks("紅茶", 50, new DrinksSpec(Size.LARGE, AddOn.TAPIOCA, BeverageTemperature.HOT, Sweetness.SUGAR_FREE));
    }
}
