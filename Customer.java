public class Customer {
private String name;
private String email;

     public Customer() {

     }
     public Customer (String name, String email) {
           this.name = name;
           this.email = email;
    }

    public void setName(String name) {
        this.name = name;
      }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
         this.email = email;
     }

    public String getEmail() {
      return this.email;
     }
    public String toString() {
      return this.name + " " + this.email;
    }
     }
     
     
     
     
     