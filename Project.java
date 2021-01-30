

public class Project {
     private static String name;
     private static String number;

     public Project(String name,String number) {
          this.name = name;
          this.number  = number;
     }

     public Project(String name,int number) {

     }

     public String getName() {
          return name;
     }

     public String getNumber() {
          return number;
     }

     public static Project createProject(String name, String number ){
          return new Project( name , number);


     }

     public boolean addProjects(String name, String number) {
          return false;
     }

     public Project listProjects(String name) {
          return null;
     }

     public boolean deleteProject(Project name) {
          return false;
     }

     public boolean removeEmployee(Project existingEmployee) {
          return false;
     }
}
