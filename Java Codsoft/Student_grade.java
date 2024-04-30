import java.util.Scanner;

class Evaluate {
    public void marks(double mrk1, double mrk2, double mrk3, double mrk4, double mrk5) {
        double total = mrk1 + mrk2 + mrk3 + mrk4 + mrk5;

        System.out.println("Total marks Obtained by the Student is:" + total + "/500");

        double avg = total / 5;
        System.out.println("Average marks Obtained by the Student is:" + avg + "%");

        System.out.println("The Grade scored by the Student is,");

        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade:A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade:B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Grade:C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade:D");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade:PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}

public class Student_grade {
    public static void main(String[] args) {
        Evaluate eval = new Evaluate();
        {
            System.out.println("Student Grade Calculator: \n Please enter the marks in each subject");

            System.out.println("Enter Subject 1 mark:");
            Scanner mark1 = new Scanner(System.in);
            double mrk1 = mark1.nextInt();

            System.out.println("Enter Subject 2 mark:");
            Scanner mark2 = new Scanner(System.in);
            double mrk2 = mark2.nextInt();

            System.out.println("Enter Subject 3 mark:");
            Scanner mark3 = new Scanner(System.in);
            double mrk3 = mark3.nextInt();

            System.out.println("Enter Subject 4 mark:");
            Scanner mark4 = new Scanner(System.in);
            double mrk4 = mark4.nextInt();

            System.out.println("Enter Subject 5 mark:");
            Scanner mark5 = new Scanner(System.in);
            double mrk5 = mark5.nextInt();

            eval.marks(mrk1, mrk2, mrk3, mrk4, mrk5);
        }
    }
}
