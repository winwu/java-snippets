package example.strategy;

public class Test {

    public static void main(String[] args) {
        
        Company demoForeignCompany = new ExampleForeignCompany();
        System.out.println("---- demoForeignCompany ----");
        demoForeignCompany.showCheckInRule();
        demoForeignCompany.showWearningRule();



        Company demoLocalCompany = new ExampleLocalCompany();
        System.out.println("---- demoLocalCompany ----");
        demoLocalCompany.showCheckInRule();
        demoLocalCompany.showWearningRule();

        System.out.println("but the local company change the check-in rule...");
        demoLocalCompany.setCheckInBehavior(new FlexibleCheckedIn());
        demoLocalCompany.showCheckInRule();


    }   
    
}
