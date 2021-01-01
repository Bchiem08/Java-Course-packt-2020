package JavaSampleProject1.src.Unit3;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.empName = "Kobe";
        emp1.empID = 200;
        emp1.empSalary = 13500;

        emp1.displayEmployeebonus();

        emp2.empName = "Susan";
        emp2.empID = 300;
        emp2.empSalary = 56400;

        emp2.displayEmployeebonus();
        

    }
    
}
