// Creating child class of teacher class
public class Lecturer extends Teacher
{
    
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    
        public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience, int gradedScore) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = gradedScore;
        this.hasGraded = false;
    }
    
    //Getter method(acessor methods) for the attributes
       
    public String getDepartment(){
        return department;
    }
    
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    
    public int getGradedScore(){
        return gradedScore;
    }
    
    public boolean getHasGraded(){
        return hasGraded;
    }
    
    //setter method(Mutator method) for graded score
    public void setGradedScore(int gradedScore){
        this.gradedScore = gradedScore;
    }
    
        // Method to grade assignments
            public String gradeAssignment(int score, String department, int yearsOfExperience) {
        if (!getHasGraded()) {
            if (this.department.equals(department) && this.yearsOfExperience >= yearsOfExperience) {
                gradedScore = score; 
                if (score >= 90) {
                    hasGraded = true;
                    return "Result: A";
                    
                } else if (score >= 80) {
                    hasGraded = true;
                    return "Result: B";
                } else if (score >= 70) {
                    hasGraded = true;
                    return "Result: C";
                } else if (score >= 60) {
                    hasGraded = true;
                    return "Result: D";
                } else {
                    return "Result: E";
                }
            } else {
                return "Unable to grade assignments at this time.";
            }
        } else {
            return "Assignment already graded.";
        }
    }
    
    // method to display the details of the lecturer
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        if (getHasGraded()) {
            System.out.println("Graded Score: " + gradedScore);
        } else {
            System.out.println("Graded Score: Not available");
        }
    }
}