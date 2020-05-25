public class Employee {
private String id;
private String name;
private String password;
private String email;
private String isManager; 

     public Employee() {

     }
     public Employee (String id, String name, String password, String email, String isManager) {
           this.id = id;
           this.name = name;
           this.password = password;
           this.email = email;
           this.isManager = isManager;
    }


    public void setId(String id) {
         this.id = id; 
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
      }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
         this.email = email;
     }

    public String getEmail() {
      return this.email;
     }
     
         public void setIsManager(String isManager) {
         this.isManager = isManager; 
    }

    public String getIsManager() {
        return this.isManager;
    }
    
    public void employeeList() {
      System.out.println(" ID: " + this.id + " Name: " + this.name + " Email:" + this.email);
    }
     }
