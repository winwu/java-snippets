package example.strategy;

public class NoRuleWarning implements WearningBehavior {
    public void getWearningRule() {
        System.out.println("There are no rules for dressing");
    }
}
