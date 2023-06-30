public class Accountant extends Employee {
    public Accountant(String name, int id, String dateOfBirth, String address) {
        super(name, id, Constants.ACCOUNTANT_TYPE, dateOfBirth, Constants.ACCOUNTANT_DEFAULT_SALARY, address);

    }

    public void openNewAccount(int num){
        System.out.println(String.format("account number %d was opened by %s",num,getName()));
    }
    public void closeAccount(int num){
        System.out.println(String.format("account number %d was closed by %s",num,getName()));
    }
    public void createReport(String rep){

        System.out.println(String.format("Accountant %s will prepare %s report",getName(),rep));
    }

}



