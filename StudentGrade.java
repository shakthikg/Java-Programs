import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
 
           Scanner scanner = new Scanner(System.in);
 
           System.out.print("Enter grade from (A, B, C or F) : ");
 
           String str = scanner.next();
           char grade = str.charAt(0);
 
           switch (grade) {
                  case 'A' -> System.out.println("Grade A - marks >=80");
    
                  case 'B' -> System.out.println("Grade B - marks >=60");
 
                  case 'C' -> System.out.println("Grade C - marks >=40");
                        
                  case 'F' -> System.out.println("Grade F - marks <40 FAIL");
                        
                  default -> System.out.println("Invalid Grade");
           }
    }
}