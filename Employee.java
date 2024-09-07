package pushpak15L1ClassObjectConstructor;

public class Employee {
    String name;
    double salary;
    int ID;
    public Employee(String name,double salary,int ID){
        this.name =name;
        this.salary =salary;
        this.ID=ID;
    }
    public double calculateYearSalary(){
        return salary*12;
    }
    public void printEmployeeDetail(){
        System.out.println("Emplolyee Name :"+name);
        System.out.println("Employee Id:"+ID);
        System.out.println("Employee Salary :"+calculateYearSalary());
    }

    public static void main(String[] args) {
        Employee pushpak =new Employee("Pushpak",43445,1);
        pushpak.printEmployeeDetail();

    }
}