public class Employee {

    private String name;
    private String userID;

    public Employee(){
        this.name = "";
        this.userID = "";
    }

    public Employee(String name, String userID){
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void getReportDetails(){
        System.out.println("Name: " + name + "\n" + "ID Number: " + userID);
    }
}
