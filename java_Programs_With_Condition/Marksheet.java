package java_Programs_With_Condition;
import java.util.Scanner;
public class Marksheet {
    public void printMarksheet(String name, long mobile, int math, int eng, int hindi, int gk, int sst) {

        int totalMarks = math + eng + hindi + gk + sst;
        float percentage = (totalMarks * 100) / 500.0f;
        System.out.println("\n-------Marksheet Details------");
        System.out.println("Your Name Is : " + name);
        System.out.println("Your Mobile Number Is : " + mobile);
        System.out.println("Your Math Mark Is : " + math);
        System.out.println("Your Eng Mark Is : " + eng);
        System.out.println("Your Hindi Mark Is : " + hindi);
        System.out.println("Your Gk Mark Is : " + gk);
        System.out.println("Your Sst Mark Is : " + sst);
        System.out.println("Your Total Marks Obtained Is : " + totalMarks);
        System.out.println("Your Percentage Obtained Is : " + percentage + "%");

        if (percentage < 33) {
            System.out.println("Sorry You Are Fail");
        } else if (percentage >= 33 && percentage < 45) {
            System.out.println("Your Grade Is Third");
        } else if (percentage >= 45 && percentage < 60) {
            System.out.println("Your Grade Is Second");
        } else {
            System.out.println("Your Grade Is First");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name = sc.next();

        System.out.println("Please Enter Your Mobile Number");
        long mobile = sc.nextLong();

        System.out.println("Please Enter Your Math Marks");
        int math = sc.nextInt();

        System.out.println("Please Enter Your Hindi Marks");
        int hindi = sc.nextInt();

        System.out.println("Please Enter Your Eng Marks");
        int eng = sc.nextInt();

        System.out.println("Please Enter Your Gk Marks");
        int gk = sc.nextInt();

        System.out.println("Please Enter Your Sst Marks");
        int sst = sc.nextInt();

        Marksheet ob = new Marksheet();
        ob.printMarksheet(name, mobile, math, eng, hindi, gk, sst);

        sc.close();
    }
}

