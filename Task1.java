// Shree Ganeshay namah 

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int totalMarks = 500;

        int obtainMarks = sub1 + sub2 + sub3 + sub4 + sub5 ; 

        float percentage = (obtainMarks  * 100)  /totalMarks;

        System.out.println("Total marks of  5 Number Is " + obtainMarks);
        System.out.println("The Percentage of These Numbers "+percentage);
        
        
        sc.close();
    }
}