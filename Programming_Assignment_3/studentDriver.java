public class studentDriver{
    public static void main(String[] args){
        CBAStudent Dylan = new CBAStudent();
        CBAStudent Connor = new CBAStudent();
        
        Connor.doHomework(2);
        System.out.println();
        Dylan.doHomework(5);
        System.out.println();
        
        String message = Dylan.showSpirit();
        System.out.println("Message: " + message);
        System.out.println("abc \\ \' def \n \" ghi");
    }
}