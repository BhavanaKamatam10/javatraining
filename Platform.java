import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Platform {
    private static final Scanner scanner =  new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList();
   //private static Random random = new Random();
   private static int identifier =1;
    public static void main(String[] args) {

        while(true) {
          int userChoice =  askUsersChoice();
            processUserChoice(userChoice);

        }
    }

    private static void processUserChoice(int userChoice){
        switch(userChoice){
            case 1:
                createEmployee();
//                final Employee employee = createEmployee();
//                employees.add(employee);
                break;

            case 2:
                System.out.println("Which employee needs to be updated?Give me the ID: ");
                updateEmployee(scanner.nextInt());

                break;

            case 3:
                System.out.println("Enter employee Id to delete!");
                deleteEmployee(scanner.nextInt());

                break;

            case 4:
                listEmployees();
                break;

        }
    }

    private static void updateEmployee(int employeeId){
        System.out.println("Enter the updated information" + employeeId);
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
       // boolean isEmployeeFound = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).getUniqueIdentifier()==(employeeId)) {
                processUpdate(employees.get(i), name, salary, age);
                break;
            }
        }

    }
    private static void processUpdate(Employee employee,String name, int salary, int age){


        employee.update(name,salary,age);

    }
    private static void deleteEmployee(int employeeId) {
        //loop through employees list until you find the employee id to be deleted.
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUniqueIdentifier() == employeeId) {
                employees.remove(i);
                System.out.println("Employee with id : "+ employeeId + "is deleted");
                break;
            }
        }
    }
    private static void listEmployees(){
        for(Employee e : employees){
            e.displayInformation();
        }
    }
    private static int askUsersChoice(){

        showChoice("Choose your choice! ");
        showChoice("1. Create Employee");
        showChoice("2. Update Employee");
        showChoice("3. Delete Employee");
        showChoice("4. List Employees");
        return scanner.nextInt();
    }

    private static void showChoice(String s){
        System.out.println(s);
    }
//    private static void showChoices(String... elements){
//        for(String element : elements){
//            showChoice(element);
//        }
//    }

    private static void createEmployee() {
        showChoice("Provide Employee details!");


        final String name = takeName();

        final int salary = takeSalary();

        final int age = takeAge();

        Employee employee = createEmployeeObject(name, salary, identifier++, age);

        employee.displayInformation();
    }

    private static Employee createEmployeeObject(String name, int i, int salary, int age) {
        return new Employee(name, salary, generateUniqueIdentifier(), age);
    }
    private static int generateUniqueIdentifier(){
        return generateUniqueIdentifier();
    }

    private static int takeAge() {
        showChoice("Age: ");
        return scanner.nextInt();
    }

    private static int takeSalary() {
        showChoice("Salary: ");
        return scanner.nextInt();
    }

    private static String takeName() {
        showChoice(" Name: ");
        return scanner.next();

    }
}
