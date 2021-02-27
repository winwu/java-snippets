package example.strategy;

public class FlexibleCheckedIn implements CheckInBehavior {
    public void getCheckRule() {
        System.out.println("Flexible clock in and out");
    }
}
