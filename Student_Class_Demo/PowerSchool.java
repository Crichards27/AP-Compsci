public class PowerSchool{
    public static void main(String[] args){
       Student Dylan = new Student("Dylan", "Havens", 2026);
       
       System.out.println("First Name: " + Dylan.getFirstName());
       System.out.println("Last Name: " + Dylan.getLastName());
       System.out.println("Grad Year: " + Dylan.getGradYear());
       System.out.println("ID Number: " + Dylan.getIdNum());

    }
}