package java_Programs_With_Condition;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student Details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Father Name: ");
        String father = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = sc.nextLine();

        // School Details
        System.out.print("Enter School Name: ");
        String school = sc.nextLine();

        System.out.print("Enter School Address: ");
        String address = sc.nextLine();

        // Fees
        System.out.print("Enter Total Fees: ");
        double totalFees = sc.nextDouble();

        System.out.print("Enter Fees Paid: ");
        double paidFees = sc.nextDouble();

        double remainingFees = totalFees - paidFees;

        // Marks
        System.out.print("Enter Marks Hindi: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks English: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks Math: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks Science: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks Computer: ");
        int m5 = sc.nextInt();

        // Calculation
        int total = m1 + m2 + m3 + m4 + m5;
        int maxMarks = 500;
        int percentage = total * 100 / maxMarks;

        // Result
        String result;
        if (percentage >= 33) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Final Report :- 
        System.out.println("\n============================================");
        System.out.println("        STUDENT FINAL REPORT");
        System.out.println("============================================");
        System.out.println("Name        : " + name);
        System.out.println("Father Name : " + father);
        System.out.println("Roll No     : " + roll);
        System.out.println("Class       : " + studentClass);
        System.out.println("School      : " + school);
        System.out.println("Address     : " + address);
        System.out.println("--------------------------------------------");
        System.out.println("Hindi       : " + m1);
        System.out.println("English     : " + m2);
        System.out.println("Math        : " + m3);
        System.out.println("Science     : " + m4);
        System.out.println("Computer    : " + m5);
        System.out.println("--------------------------------------------");
        System.out.println("Total Marks : " + total + "/" + maxMarks);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Result      : " + result);
        System.out.println("--------------------------------------------");
        System.out.println("Total Fees  : ₹" + totalFees);
        System.out.println("Paid Fees   : ₹" + paidFees);
        System.out.println("Remaining   : ₹" + remainingFees);
        System.out.println("============================================");

        sc.close();
    }
}