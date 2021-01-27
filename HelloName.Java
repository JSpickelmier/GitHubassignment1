import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
   
Scanner sc = new Scanner(System.in);
System.out.print("What is your name? ");  
String str = sc.nextLine();               
System.out.print("Hello "+str+"!");          
  }   
}