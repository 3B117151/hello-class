 import java.util.Scanner;

public class Test7{
    public static void main (String[] args){
        int grade;
        
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter frist integer:");
        grade = input.nextInt();
        
        if (grade <= 100 | grade < 0) {
            System.out.println("");
        switch (grade/10){
            case 9:
            case 10:
                System.out.println("a");
                break;
            case 8:
                System.out.println("b");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("d");
                break;
            default:
                System.out.println("e");
                break;
        }
        }
        else {
            System.out.println("error");
        }
    }
}
