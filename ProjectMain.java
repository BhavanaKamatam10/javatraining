import java.util.Scanner;

public class ProjectMain {
    static Scanner scanner = new Scanner(System.in);
    private static  Project project = new Project("JavaProject",22);
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printAction();
        while (!quit) {
            System.out.println("Enter action:(6 to show available actions)");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    printAction();
                    break;
                case 1:
                    addProjects();
                    break;
                case 2:
                    listProjects();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    deleteProject();
                    break;
                case 6:
                    listEmployee();
                    break;

            }
        }
    }
            private static void addProjects() {
                System.out.println("Enter project name: ");
                String name = scanner.nextLine();
                System.out.println("Enter project number:1 ");
                String number = scanner.nextLine();
                Project project= Project.createProject(name, number);
                if (project.addProjects(name,number)) {
                    System.out.println("New Project added: name  = " + name + ", number = " + number);
                } else {
                    System.out.println("Cannot add, " + name + "already on file");
                }
            }

            private static void listProjects()  {


            }

            private static void addEmployee() {

            }
            private static void removeEmployee() {
//                System.out.println("Enter existing employee name: ");
//                String name = scanner.nextLine();
//                Project existingEmployee= project.(name);
//                if (existingEmployee == null) {
//                    System.out.println("Employee not found.");
//                    return;
//                }
//                if(project.removeEmployee(existingEmployee)){
//                    System.out.println("Successfully removed");
//                }else{
//                    System.out.println("Error deleting employee");
//                }

            }

            private static void deleteProject() {
//                System.out.println("Enter existing project name: ");
//                String name = scanner.nextLine();
//                Project existingProject= project.(name);
//                if (existingProject == null) {
//                    System.out.println("Project not found.");
//                    return;
//                }
//                if(project.deleteProject(existingProject)){
//                    System.out.println("Successfully deleted");
//                }else{
//                    System.out.println("Error deleting project");
//                }
            }


             private static void listEmployee() {

    }


            private static void printAction() {
                System.out.println("\nAvailable actions:\npress");
                System.out.println("0 -Enter action:(6 to show available actions) \n" +
                        "1 - to add projects \n" +
                        "2 - to list projects \n" +
                        "3 - to add employees to the projects \n" +
                        "4 - to remove employees from the project \n" +
                        "5 - to delete project \n" +
                        "6 - to list employees of the given project");
                System.out.println("choose your action: ");
            }

    }

