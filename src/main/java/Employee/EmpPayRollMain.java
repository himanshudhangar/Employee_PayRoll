package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayRollMain {
	Scanner SC = new Scanner(System.in);

    public enum Ioservice {CONSALE_IO, FILE_IO, DB_IO, REST_IO}

    private List<EmpPayRollDetail> employeePayrollList;

    public EmpPayRollMain() {
        this.employeePayrollList = new ArrayList<EmpPayRollDetail>();
    }

    public EmpPayRollMain(List<EmpPayRollDetail> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmpPayRollDetail> employeePayrollList = new ArrayList<EmpPayRollDetail>();
        EmpPayRollMain employeePayrollService = new EmpPayRollMain(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee Id:");
        int employeeId = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String employeeName = consoleInputReader.next();
        System.out.println("Enter Employee Salary:");
        double employeeSalary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmpPayRollDetail(employeeId, employeeName, employeeSalary));
    }

    public void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Cansole\n" + employeePayrollList);
    }
}