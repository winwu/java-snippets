package example.strategy;

public class NeedCheckIn implements CheckInBehavior {
    public void getCheckRule() {
        System.out.println("Need to check in");
    }
}
