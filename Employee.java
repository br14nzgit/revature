public class Employee {
    public int employeeID;
    public String employeeName;

    public Employee(){
        employeeID = -1;
        employeeName = "N/A";
    }
    public void employeePrint(){
        System.out.println("Employee: " + employeeName + " , ID: " + employeeID);
    }
    public Employee(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void main(String[] args) {
        Employee notfound = new Employee();
        Employee e1 = new Employee(1234, "Amy");
        notfound.employeePrint();
        e1.employeePrint();


    }
}
