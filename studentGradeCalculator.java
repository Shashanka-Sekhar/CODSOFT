import java.util.*;
public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1, s2, s3, s4, s5;
        double subjects = 5;
        System.out.print("Enter mark secured in first subject: ");
        s1 = sc.nextDouble();
        System.out.print("Enter mark secured in second subject: ");
        s2 = sc.nextDouble();
        System.out.print("Enter mark secured in third subject: ");
        s3 = sc.nextDouble();
        System.out.print("Enter mark secured in fourth subject: ");
        s4 = sc.nextDouble();
        System.out.print("Enter mark secured in fifth subject: ");
        s5 = sc.nextDouble();
        double totalMark = s1 + s2 + s3 + s4 + s5;
        System.out.println("The total mark secured: " + totalMark);
        double avgPercentage = totalMark / subjects;
        System.out.println("The average percentage secured: " + avgPercentage);
        sc.close();
        double cgpa = avgPercentage * 0.1;
        if(cgpa >= 9.0) {
            System.out.println("Congratulations! You have secured O Grade!");
        }
        else if(cgpa >= 8.0 && cgpa <= 8.9) {
            System.out.println("Congratulations! You have secured A Grade!");
        }
        else if(cgpa >= 7.0 && cgpa <= 7.9) {
            System.out.println("Congratulations! You have secured B Grade!");
        }
        else if(cgpa >= 6.0 && cgpa <= 6.9) {
            System.out.println("Congratulations! You have secured C Grade!");
        }
        else if(cgpa >= 5.0 && cgpa <= 5.9) {
            System.out.println("Try harder! You have secured D Grade!");
        }
        else if(cgpa >= 4.0 && cgpa <= 4.9) {
            System.out.println("Try harder! You have secured E Grade!");
        }
        else {
            System.out.println("Sorry! You have secured F Grade!");
        }
    }
}
