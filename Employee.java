/**
 * Owen Valasek
 * CH3PC1 - Employee Class
 * 9/25/18
 */
public class Employee {
    //declare the fields 
    private String name;
    private int idNumber;
    private String department;
    private String position; 
    //create the constructor 
    /**
     * Employee class constructor initializes name, idNumber,
     * department, and position fields
     */
    public Employee(String n, int idNum, String d, String p){
            name = n;
            idNumber = idNum;
            department = d;
            position = p;
    }
    //create the accessor and mutator methods
    /**
     * The setName method accepts an argument that is stored 
     * In the width field
     */
    public void setName(String n){
        name = n;
    }
    /**
     * The setIdNumber method accepts an argument that is stored 
     * In the IdNumber field
     */
    public void setIdNumber(int idNum){
        idNumber = idNum;
    }
    /**
     * The setDepartment method accepts an argument that is stored 
     * In the Department field
     */
    public void setDepartment(String d){
        department = d;
    }
    /**
     * The setPosition method accepts an argument that is stored 
     * In the Position field
     */
    public void setPosition(String p){
        position = p;
    }
    /**
     * The getName method returns the value stored 
     * In the name field
     */
    public String getName(){
        return name;
    }
    /**
     * The getIdNumber method returns the value stored 
     * In the idNumber field
     */
    public int getIdNumber(){
        return idNumber;
    }
    /**
     * The getDepartment method returns the value stored
     * In the Department field
     */
    public String getDepartment(){
        return department;
    }
    /**
     * The getPosition method returns the value stored 
     * In the position field
     */
    public String getPosition(){
        return position;
    } 
   }

