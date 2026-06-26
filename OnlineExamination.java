
import java.util.Scanner;

public class OnlineExamination {

    static Scanner sc = new Scanner(System.in);

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        if (login()) {

            int choice;

            do {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Update Password");
                System.out.println("2. Start Exam");
                System.out.println("3. Logout");

                System.out.print("Enter Choice : ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        updatePassword();
                        break;

                    case 2:
                        exam();
                        break;

                    case 3:
                        logout();
                        break;

                    default:
                        System.out.println("Invalid Choice!");

                }

            } while (choice != 3);

        } else {

            System.out.println("Invalid Username or Password!");

        }

    }

    static boolean login() {

        System.out.print("Username : ");
        String user = sc.nextLine();

        System.out.print("Password : ");
        String pass = sc.nextLine();

        return user.equals(username) && pass.equals(password);

    }

    static void updatePassword() {

        System.out.print("Enter Current Password : ");
        String oldPass = sc.nextLine();

        if (oldPass.equals(password)) {

            System.out.print("Enter New Password : ");
            password = sc.nextLine();

            System.out.println("Password Updated Successfully!");

        } else {

            System.out.println("Wrong Password!");

        }

    }

    static void exam() {

        String[] questions = {

                "1. Java is a ?",
                "2. Which company developed Java?",
                "3. JVM stands for ?"

        };

        String[][] options = {

                {"A. Programming Language","B. Database","C. OS","D. Browser"},

                {"A. Microsoft","B. Sun Microsystems","C. Google","D. Apple"},

                {"A. Java Virtual Machine","B. Java Variable Method","C. Joint Virtual Machine","D. Java Vendor Machine"}

        };

        char[] answers = {'A','B','A'};

        char[] userAnswers = new char[questions.length];

        System.out.println("\nExam Started");
        System.out.println("Time Limit : 60 Seconds");

        long startTime = System.currentTimeMillis();

        for(int i=0;i<questions.length;i++){

            long elapsed = (System.currentTimeMillis()-startTime)/1000;

            if(elapsed>=60){

                System.out.println("\nTime Over!");
                break;

            }

            System.out.println("\n"+questions[i]);

            for(String option:options[i]){

                System.out.println(option);

            }

            System.out.print("Answer : ");

            userAnswers[i]=Character.toUpperCase(sc.next().charAt(0));

            long current=(System.currentTimeMillis()-startTime)/1000;

            if(current>=60){

                System.out.println("\nTime Over! Auto Submitted.");
                break;

            }

        }

        sc.nextLine();

        int score=0;

        for(int i=0;i<questions.length;i++){

            if(userAnswers[i]==answers[i]){

                score++;

            }

        }

        System.out.println("\n===== RESULT =====");

        System.out.println("Total Questions : "+questions.length);
        System.out.println("Correct Answers : "+score);
        System.out.println("Wrong Answers : "+(questions.length-score));
        System.out.println("Score : "+score+"/"+questions.length);

    }

    static void logout(){

        System.out.println("\nLogout Successful!");
        System.out.println("Thank You.");

    }

}