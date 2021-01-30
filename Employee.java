public class Employee {

    private String name;
    private int salary;
    private int uniqueIdentifier;
    private int age;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public void setUniqueIdentifier(int uniqueIdentifier) {
//        this.uniqueIdentifier = uniqueIdentifier;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int salary, int uniqueIdentifier, int age) {
        this.name = name;
        this.salary = salary;
        this.uniqueIdentifier = uniqueIdentifier;
        this.age = age;


    }
    public void update(String name, int salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public void displayInformation() {
        System.out.println(this.name + this.age + "," + this.salary + "," + this.uniqueIdentifier);
    }


}
