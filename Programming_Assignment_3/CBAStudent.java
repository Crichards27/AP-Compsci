public class CBAStudent{
    public void doHomework(int numHours){
        for(int i = numHours; i >0; i--)
        System.out.println("Doing homework...");
    }
    
    public String showSpirit(){
        String spiritMessage = "Go Colts";
        System.out.print(spiritMessage);
        return spiritMessage;
    }
    
    public int studentID(){
        int studentID = 2027170;
        return studentID;
    }
    
    public void talk_to_Robot(int studentID){
        System.out.println("Whats your student ID");
        System.out.println("My ID is " + studentID);
    }
}