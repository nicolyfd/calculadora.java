import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
Scanner myObj = new Scanner(System.in);
   
    //Variables
    Double real;
    Double views = 30.0;
    Double clicks = 3.6;
    Double shares = .54;
    Double newViews = 40.0;
   
   
    System.out.println("Please Enter The Budget For Your Advertising: $");
    real = myObj.nextDouble();  
   
    //Multiplication to find advertising statistics
    views = real * views;
    clicks = real * clicks;
    if ((real * shares) <= 4.0) {
        shares = real * shares;
    }
    else {
        shares = 4.0;
    }
    newViews = shares * newViews;
       
    System.out.println("Your Budget is: $" + real);
    System.out.println("Estimated Views: " + views);
    System.out.println("Estimated Clicks: " + clicks);
    System.out.println("Estimated Shares: " + shares);
    System.out.println("Estimated New Views: " + newViews);
    System.out.println("\n TOTAL VIEWS: " + (views+newViews));
   
    }
}
