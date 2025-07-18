//Class Tutor is a child of Teacher class 
//creating child class of teacher class
public class Tutor extends Teacher{ 
   private int workingHours;
   private double salary;
   private String specialization; 
   private String academicQualifications; 
   private int performanceIndex; 
   private boolean isCertified; 
    //using constructor for Tutor 
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
    int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.workingHours = workingHours;
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        super.setWorkingHours(workingHours);// set working hours for Tutor object
    }
    //Using Getter Method (accessor method) 
    public int getWorkingHours() {
        return workingHours;
    }
    public double getSalary(){ 
        return salary; 
    } 
    public String getSpecialization(){ 
        return specialization; 
    } 
    public String getAcademicQualifications(){ 
        return academicQualifications; 
    } 
    public int getPerformanceIndex(){ 
        return performanceIndex; 
    } 
    public boolean getIsCertified(){ 
        return isCertified; 
    } 
    //Using Setter Method (mutator method) 
         public String setSalary(double newSalary, int newPerformanceIndex) {
        if (!isCertified && newPerformanceIndex > 5 && workingHours > 20) {
            double appraisalPercentage;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisalPercentage = 5;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisalPercentage = 10;
            } else { // newPerformanceIndex is 10
                appraisalPercentage = 20;
            }
            double appraisal = (appraisalPercentage / 100) * salary;
            salary += appraisal + newSalary - salary;
            performanceIndex = newPerformanceIndex;
            isCertified = true;
            return "Salary approved for " + getTeacherName() + ". New salary: " + salary;
        } else {
            return "Salary cannot be approved at this time for " + getTeacherName();
        }
    }
    
     
      public void removeTutor() {
        if (!isCertified) {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            isCertified = false;
            System.out.println("Tutor removed successfully.");
        } else {
            System.out.println("Cannot remove certified tutor.");
        }
        }
        //Display method
      @Override
      public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Academic Qualifications: " + academicQualifications);
        System.out.println("Performance Index: " + performanceIndex);
        System.out.println("Salary: " + salary);
}
}