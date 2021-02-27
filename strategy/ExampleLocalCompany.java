package example.strategy;

public class ExampleLocalCompany extends Company {
    public ExampleLocalCompany() {
        setCheckInBehavior(new NeedCheckIn());
        setWearningBehavior(new UniformWearning());
    }
}
