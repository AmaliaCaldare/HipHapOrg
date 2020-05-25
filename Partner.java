public class Partner {
private String name;
private String service;
private double price;

     public Partner() {

     }
     public Partner (String name, String service, double price) {
           this.name = name;
           this.service = service;
           this.price = price;
    }

    public void setName(String name) {
        this.name = name;
      }

    public String getName() {
        return this.name;
    }

    public void setService(String Service) {
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

    public void setPrice(double price) {
         this.price = price;
     }

    public double getPrice() {
      return this.price;
     }     
     
       public void partnerList() {
      System.out.println("Name: " + this.name + " Service: " + this.service + " Price: " + this.price);
    }
     }
