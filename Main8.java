import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
 
    System.out.println("enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);

    System.out.println("enter your age");
    int age = scanner.nextInt();
    scanner.nextLine();
 
    if (age >= 18) {
        System.out.println("Acess granted");
        
        System.out.println("do you have an ID (respond Yes or No)");
        String IDtwo = scanner.nextLine();
        boolean ID = IDtwo.trim().equalsIgnoreCase("yes");
        
        
        if (ID == true) {
            System.out.println("Acess granted, " + name);
        } else {
            System.out.println("Acess denied: don't have an ID");
        }
        
        scanner.close();
        
    } else {
        System.out.println("Acess denied: underage");
    }
    }
} 