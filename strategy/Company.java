package example.strategy;

public abstract class Company {
    CheckInBehavior checkInBehavior;
    WearningBehavior wearningBehavior;

    public Company() {}

    public void setCheckInBehavior(CheckInBehavior b) {
        checkInBehavior = b;
    }

    public void setWearningBehavior(WearningBehavior b) {
        wearningBehavior = b;
    }

    public void showCheckInRule() {
        checkInBehavior.getCheckRule();
    }

    public void showWearningRule() {
        wearningBehavior.getWearningRule();
    }
}
