public class Student{
    private String lastName;
    private String firstName;
    private int gradYear;
    private double gpa;
    private int idNum;
    private static int nextID = 1;
    private boolean isTransfer;
    
    public Student(){
        lastName = "";
        firstName = "";
        gradYear = 2026;
        gpa = 4.0;
        isTransfer = false;
        idNum = nextID;
        nextID++;
    }
    
    public Student(String myFirst, String myLast, int myGradYear){
        firstName = myFirst;
        lastName = myLast;
        gradYear = myGradYear;
        idNum = nextID;
        nextID++;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public int getGradYear(){
        return gradYear;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public boolean isTransfer(){
        return isTransfer;
    }
    
    public void changeFirstName(String newFirst){
        firstName = newFirst;
    }
    
    public void changeLastName(String newLast){
        lastName = newLast;
    }
    
    public void changeGradYear(int newGrad){
        gradYear= newGrad;
    }
    
    public void updateGPA(double newGPA){
        gpa += newGPA;
        if(gpa > 4.5){
            gpa = 4.5;
        }
        else if(gpa < 0){
            gpa = 0;
        }
    }
    
    public int getIdNum(){
        return idNum;
    }
    
    public boolean equals (Object other){
        if(other == null){
            return false;
        }
        else{
            Student s = (Student) other;
            return (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName) && s.getGradYear() == gradYear); 
        }
    }
}