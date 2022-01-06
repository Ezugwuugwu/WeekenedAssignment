package ChapterThree;

public class EmployeeClass {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public EmployeeClass(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary < 0){
            monthlySalary =0.0;
        }
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getSalaryAfterPercentageIncrease(){
        double percentage = 0.1 * monthlySalary;

        return percentage + monthlySalary;
    }

    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass("Emeka", "Ogini",5000.0);
        EmployeeClass employee2 = new EmployeeClass("Ngozi", "Okafor", 1000.0);

//        employee1.setFirstName("John"); employee1.setLastName("Kasie"); employee1.setMonthlySalary(120);
//        employee2.setFirstName("Mark"); employee2.setLastName("Dossy"); employee2.setMonthlySalary(400);

        System.out.println("Employee One details:");
        System.out.println("Name: "+employee1.getFirstName()+" "+employee1.getLastName());
        System.out.println("employee one salary: "+employee1.getMonthlySalary());
        System.out.println();

        System.out.println("Employee two details:");
        System.out.println("Name: "+employee2.getFirstName()+" "+employee2.getLastName());
        System.out.println("employee two salary: "+employee2.getMonthlySalary());


        System.out.println("\nSalary after 10% increase:");
        System.out.println("Employee One: "+employee1.getSalaryAfterPercentageIncrease());
        System.out.println("Employee two: "+employee2.getSalaryAfterPercentageIncrease());
    }
}
