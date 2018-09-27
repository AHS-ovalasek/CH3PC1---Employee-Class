/**
 * Owen Valasek
 * CH3PC1 - Employee Class
 * Programming III - AP CS
 * 9/25/18
 */
public class EmployeeRunner {

    public static void main(String[] args) {
        Employee Susan = new Employee("Susan Meyers",
                47899, "Accounting", "Vice President");
        
        Employee Mark = new Employee("Mark Jones", 39119,
                "IT", "Programmer");
        
        Employee Joy = new Employee("Joy Rogers", 
                81774, "Manufacturing", "Engineer");
        
        String n;
        int idNum;
        String d;
        String p;
        
        System.out.println("");
        
        n = Susan.getName();
        idNum = Susan.getIdNumber();
        d = Susan.getDepartment();
        p = Susan.getPosition();
        
        System.out.println("Name" + "\t" + "    ID Number" + "\t" + 
                "Department" + "\t" + "Position");
        
        System.out.println("-------------------------------------"
                + "-----------------");
        
        System.out.print(n + "\t" + idNum + "\t" + d + "\t" + p + "\n");
        
        n = Mark.getName();
        idNum = Mark.getIdNumber();
        d = Mark.getDepartment();
        p = Mark.getPosition();
        
        System.out.print(n + "\t" + idNum + "\t" + d + "       \t" + p + "\n");
        
        n = Joy.getName();
        idNum = Joy.getIdNumber();
        d = Joy.getDepartment();
        p = Joy.getPosition();
        
        System.out.print(n + "\t" + idNum + "\t" + d + "\t" + p + "\n");
    }

}
