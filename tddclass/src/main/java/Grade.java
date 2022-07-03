import java.security.SecureRandom;
import java.util.Scanner;
public class Grade {
    private static int grade;


     public static void addRandoms(){
        Scanner sc = new Scanner(System.in);

        SecureRandom sr = new SecureRandom();

        //generating a random int value
        int number1 = sr.nextInt(10);
        int number2 = sr.nextInt(10);


        System.out.print("What is " + number1 + " + " + number2 + "? ");
        //collecting input
        int answer = sc.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }

    public static void setGradeChecker(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        grade = input.nextInt();

        if(grade <10 ){
            System.out.println("F");
        }

        else if(grade >=20  && grade < 31){
            System.out.println("D");
        }
        else
        if(grade > 30 ){
            System.out.print("C" + 6);

        }
    }

    public static void main(String[] args) {

    }



}
