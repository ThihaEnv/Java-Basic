import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        // var declaration
        int age;
        int score;
        String name;
        String grade;
        String status;

        Scanner input = new Scanner(System.in);

        //create data input
        System.out.print("Enter student's name : ");
        name = input.nextLine();

        System.out.print("Enter score : ");
        score = input.nextInt();

        System.out.print("Enter age : ");
        age = input.nextInt();

        // condition checking for score and show grade
        if( score >= 90 ){
            grade = "Grade A";
        }else if ( score >= 80 ) {
            grade = "Grade B";
        }else if ( score >= 70 ) {
            grade = "Grade C";
        }else if ( score >= 60 ) {
            grade = "Grade D";
        }else{
            grade = "Grade F";
        }

        // condition checking for age and show status
        if ( age >= 18 ){
            status = "Adult Student";
        }else{
            status = "Minor Student";
        }

        //show student's infos
        System.out.println("--- Student Result ---");
        System.out.println("Name : "+ name);
        System.out.println("Score : "+score);
        System.out.println("Grade : "+grade);
        System.out.println("Status : "+status);
        // input shut down
        input.close();
    }
}
