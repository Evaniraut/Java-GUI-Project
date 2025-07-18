//Creating Teacher class 
public class Teacher{ 
    //Attributes
    private int teacherID; 
    private String teacherName; 
    private String address; 
    private String workingType; 
    private String employmentStatus; 
    private int workingHours; 
   // constructor with parameters
    public Teacher(int teacherID, String teacherName, String address, String workingType, 
    String employmentStatus){ 
        // instance variables
        this.teacherID = teacherID; 
        this.teacherName = teacherName; 
        this.address = address; 
        this.workingType = workingType; 
        this.employmentStatus = employmentStatus; 
        
    } 
   
   //Getter Method (Accessor Method) for attributes
    public int getTeacherID(){ 
        return teacherID; 
    } 
    public String getTeacherName(){ 
        return teacherName; 
    } 
    public String getAddress(){ 
        return address; 
    } 
    public String getWorkingType(){ 
        return workingType; 
    } 
    public String getEmploymentStatus(){ 
        return employmentStatus; 
    } 
    public int getWorkingHours() {
        return workingHours;
    }

    //Setter Method 
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

     // method to display the details of the teacher
    public void display() {
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);
        if (workingHours > 0) {
            System.out.println("Working Hours: " + workingHours);
        } else {
            System.out.println("Working Hours: Not assigned");
}
}
}
