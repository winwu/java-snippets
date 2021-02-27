package example.strategy;

public class NoNeedCheckIn implements CheckInBehavior {
    public void getCheckRule() {
        System.out.println("No need to check in");
    }
}
