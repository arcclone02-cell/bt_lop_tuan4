public class Employee {
    private String FirstName;
    private String LastName;
    private int id;
    private String Salary;

    public Employee() {
        this.FirstName = "Unknown";
        this.LastName = "Unknown";
        this.id = 0;
        this.Salary = "None";
    }

    public Employee(String FirstName, String LastName, int id, String Salary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;
        this.Salary = Salary;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getFirstName() {
        return this.FirstName;
    }    

    public String getLastName() {
        return this.LastName;
    }    

    public int getId() {
        return this.id;
    }    

    public String getSalary() {
        return this.Salary;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee[FirstName=" + this.FirstName + ", LastName=" + this.LastName + ", id=" + this.id + ", Salary=" + this.Salary + "]";
    }
}