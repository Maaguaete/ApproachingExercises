package advancedbasic;

public class Students {

    private int studentID;
    private String fullName;
    private float theoryPoint, practicePoint;

    public Students(){
    }
    public Students(int studentID, String fullName, float theoryPoint, float practicePoint){
        this.studentID = studentID;
        this.fullName = fullName;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }
    public void displayStu(){
        System.out.printf("%3d  %-18s %10.2f %12.2f %12.2f\n",
                studentID, fullName, theoryPoint, practicePoint, averagePoint());
    }
    public String toString(){
        System.out.printf("%3d  %-18s %10.2f %12.2f %12.2f\n",
                studentID, fullName, theoryPoint, practicePoint, averagePoint());
        return "Student ID  Full Name  Theory Point  Practice Point  Average Point\n"+
                studentID+" "+fullName+" "+theoryPoint+" "+practicePoint+" "+averagePoint();
    }
    float averagePoint(){
        return (theoryPoint+practicePoint)/2;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public float getTheoryPoint(){
        return theoryPoint;
    }
    public void setTheoryPoint(float theoryPoint){
        this.theoryPoint = theoryPoint;
    }
    public float getPracticePoint(){
        return practicePoint;
    }
    public void setPracticePoint(float practicePoint){
        this.practicePoint = practicePoint;
    }


}
