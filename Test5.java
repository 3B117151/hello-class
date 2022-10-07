 import java.util.Scanner;

public class Test5{
    public static void main (String[] args){
        int grade;
        
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter frist integer:");
        grade = input.nextInt();
        
        if (grade >= 90) {
                System.out.println("a");
        }
        else if (grade >= 80){
            System.out.println("b");
        }
        else if (grade >= 70){
            System.out.println("c");
        }
        else if (grade >= 60){
            System.out.println("d");
        }
        else {
            System.out.println("e");
        }
    }
}