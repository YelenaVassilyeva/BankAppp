public abstract class Employee {
    private String name;
    private int id;
    private String title;
    private String dateOfBirth;



    private double salary;
    private String address;

    public Employee(String name, int id, String title, String dateOfBirth, double salary, String address) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public void receiveSalary(){
       System.out.println(String.format("The salary was sent to the %s bank account",getName()));
   }

    public String toString(){
        String txt = String.format("Employee name: %s, id: %d, title : %s, date of birth: %s, salary: %.2f, address: %s", name, id, title, dateOfBirth, salary, address);
        return txt;
    }


}
