public class Clerk extends Employee{

    public Clerk(String name, int id, String dateOfBirth, String address) {
        super(name, id, Constants.CLERK_TYPE, dateOfBirth,Constants.CLERK_DEFAULT_SALARY, address);
    }

    public void makeCall(String customerName) {
        System.out.println(String.format("Clerk %s Connected to customer %s ", getName(), customerName));

    }

    public void getCall(String customerName) {
        System.out.println(String.format("Clerk %s Answered to customer %s ", getName(), customerName));


    }
}
