public class Manager extends Employee{
    public Manager(String name, int id, String dateOfBirth, String address) {
        super(name, id, Constants.MANAGER_TYPE, dateOfBirth, Constants.MANAGER_DEFAULT_SALARY, address);
    }

    public void hireEmployee(String employeeName){
        System.out.println(String.format("the employee %s was hired by %s", employeeName, getName()));
    }public void fireEmployee(String employeeName){
        System.out.println(String.format("the employee %s was fired by %s", employeeName,getName()));
    }
}
