public class BankAppMain {
    public static void main(String[] args) {
 Manager manager=new Manager("Daisy",1,"12.4.56","nyc") ;
 Accountant accountant1=new Accountant("Frank",2,"2.6.89","tlv");
 Clerk clerk1=new Clerk("Dustin",4,"4.5.98","nyc");

        System.out.println(manager.toString());
        System.out.println(clerk1.toString());
        System.out.println(accountant1.toString());
        clerk1.setName("Dustin-Robert");
        System.out.println(clerk1.toString());
        manager.fireEmployee("Dustin");
        manager.receiveSalary();
        manager.hireEmployee("James");
        clerk1.makeCall("Kenneth");
        clerk1.getCall("Ted");
        clerk1.receiveSalary();
        accountant1.closeAccount(54);
        accountant1.openNewAccount(657);
        accountant1.createReport("annual");
        accountant1.receiveSalary();


    }

}
