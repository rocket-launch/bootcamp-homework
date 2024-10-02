import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] employeeData = new String[]{"name", "last name", "age", "number (27560000 - 27569999)"};
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < employeeData.length; ++i) {
            System.out.println("Please enter the employee's " + employeeData[i] + ": ");
            String userInput = input.nextLine();
            switch (i) {
                case 0:
                    employee.setFirstName(userInput);
                    break;
                case 1:
                    employee.setLastName(userInput);
                    break;
                case 2:
                    employee.setAge(Integer.parseInt(userInput));
                    break;
                case 3:
                    employee.setEmployeeNumber(Integer.parseInt(userInput));
            }
        }

        employee.printEmployeeData();
    }
}