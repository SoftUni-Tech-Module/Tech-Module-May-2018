import java.util.Scanner;

public class P03EmployeeData {

    public static void main(String[] args) {
		
        // Initialize our console -> Scanner in JAVA
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();

        int age = Integer.parseInt(console.nextLine());
        int employee = Integer.parseInt(console.nextLine());
        double salary = Double.parseDouble(console.nextLine());

		// We don`t have string interpolation in JAVA, so we use String.format -> Google it.
		// %n is a line break => System.getProperty("line.separator")
        System.out.printf("Name: %s%nAge: %d%nEmployee ID: %08d%nSalary: %.2f", name, age, employee, salary);

    }
}
