package example.strategy;

public class ExampleForeignCompany extends Company {
    public ExampleForeignCompany() {
        setCheckInBehavior(new NeedCheckIn());
        setWearningBehavior(new NoRuleWarning());
    }
}
