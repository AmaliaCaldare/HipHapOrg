public class Event {

 private String id;
 private String name;
 private String type;
 private String date;
 private String location;
 private String eventPrice;
 private String employee;

 public Event() {

 }

 public Event(String id, String name, String type, String date, String location, String employee, String eventPrice) {
  this.id = id;
  this.name = name;
  this.type = type;
  this.date = date;
  this.location = location;
  this.employee = employee;
  this.eventPrice = eventPrice;
 }

  public void setId(String id) {
    this.id = id;
  }
    public void setName(String name) {
    this.name = name;
  }
    public void setType(String type) {
    this.type = type;
  }
    public void setDate(String date) {
    this.date = date;
  }
    public void setLocation(String location) {
    this.location = location;
  }
    public void setEventPrice(String eventPrice) {
    this.eventPrice = eventPrice;
  }
   public void setEmployee(String employee) {
      this.employee = employee;
      }

 public String getEmployee() {
  return this.employee;
 }
 public String getId() {
  return id;
 }

 public String getName() {
  return name;
 }
 public String getType() {
  return type;
 }
 public String getDate() {
  return date;
 }
 public String getLocation() {
  return location;
 }
 public String getEventPrice() {
  return eventPrice;
 }

 public void eventList() {
  System.out.println("ID: " + this.id + " Name: " + this.name + " Type: " + this.type + " Date: " + this.date + " Location: " + this.location + " Organiser: " + this.employee + " Price: " + this.eventPrice);
 }
 public String toString() {
 return this.id + ":" +  this.name + ":" + this.type + ":" + this.date + ":" + this.location + ":" + this.employee + ":" + this.eventPrice;
 }

}
