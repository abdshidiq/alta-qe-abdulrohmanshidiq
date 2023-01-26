import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter nilai : ");

        int studentScore = myObj.nextInt();  // Read user input

        String grade;

        if (studentScore >= 80 && studentScore <=100){
            grade = "A";
        }
        else if (studentScore >=70 && studentScore <=80){
            grade = "B";
        }
        else if (studentScore >=60 && studentScore <=70){
            grade = "C";
        }
        else if (studentScore>=55&&studentScore<=60){
            grade = "C";
        }
        else {
            grade = "E";
        }
        System.out.println(grade);
        System.out.println(80+" "+ grade);
    }

}
